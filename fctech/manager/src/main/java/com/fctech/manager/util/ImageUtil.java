package com.fctech.manager.util;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

import javax.imageio.ImageIO;
import javax.imageio.ImageReader;
import javax.imageio.stream.FileImageInputStream;
import javax.imageio.stream.ImageInputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

/**
 * Created by joe on 15/6/10.
 */
public class ImageUtil {

   // private static Logger logger = LoggerFactory.getLogger( ImageUtil.class);

    public static void reduceImg(String imgsrc, String imgDist, int newwidth,
                                 int newheight) {
        try {

            if ( newwidth==0 && newheight==0 ) {
                return;
            }else{
                Dimension dimension = getImageDim( imgsrc );
                System.out.println(dimension.getWidth() + "===********===" + dimension.getHeight());
                if( newwidth == 0 ){
                    newwidth = getSize(imgsrc, newheight, dimension.getHeight(), dimension.getWidth() );
                }
                if( newheight == 0 ){
                    newheight = getSize(imgsrc, newwidth, dimension.getWidth(), dimension.getHeight() );
                }
            }

            File srcfile = new File(imgsrc);
            if (!srcfile.exists()) {
               // logger.info("图片路径错误" ＋ imgsrc );
                return;
            }
            Image src = ImageIO.read(srcfile);
            BufferedImage tag = new BufferedImage(newwidth, newheight,
                    BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = tag.createGraphics();
            g2d.drawImage(src.getScaledInstance(newwidth, newheight, Image.SCALE_SMOOTH), 0, 0, null);
            g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP,1.0f)); //透明度设置开始
            FileOutputStream out = new FileOutputStream(imgDist);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(out);
            encoder.encode(tag);
            out.close();
            System.out.println("========= end =========" );
        } catch (IOException ex) {
            System.out.println("==========error ========");
            ex.printStackTrace();
            //logger.error(ex.getMessage());
        }
    }

    /**
     *
     * @param path 图片路径
     * @param div_new 新长度或高度
     * @param div_ori 原长度或高度
     * @param mul_ori 新高度或长度（类型与 divnew，divori 相反）
     * @return
     */
    private static  int getSize( String path , int div_new,double div_ori,double mul_ori ){
        double percent = MathHelper.div(Double.valueOf(div_new), Double.valueOf(div_ori)) ;
        double size = MathHelper.mul(Double.valueOf(mul_ori), percent);
        return ((int) size);
    }

    /**
     * 将背景为黑色不透明的图片转化为背景透明的图片
     * @param image 背景为黑色不透明的图片（用555格式转化后的都是黑色不透明的）
     * @return 转化后的图片
     */
    private static BufferedImage getConvertedImage(BufferedImage image){
        int width=image.getWidth();
        int height=image.getHeight();
        BufferedImage convertedImage=null;
        Graphics2D g2D=null;
        //采用带1 字节alpha的TYPE_4BYTE_ABGR，可以修改像素的布尔透明
        convertedImage=new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        g2D = (Graphics2D) convertedImage.getGraphics();
        g2D.drawImage(image, 0, 0, null);
        //像素替换，直接把背景颜色的像素替换成0
        for(int i=0;i<width;i++){
            for(int j=0;j<height;j++){
                int rgb=convertedImage.getRGB(i, j);
                if(isBackPixel(rgb)){
                    convertedImage.setRGB(i, j,0);
                }
            }
        }
        g2D.drawImage(convertedImage, 0, 0, null);
        return convertedImage;
    }

    /**
     * 判断当前像素是否为黑色不透明的像素（-16777216）
     * @param pixel 要判断的像素
     * @return 是背景像素返回true，否则返回false
     */
    private static boolean isBackPixel(int pixel){
        int back[]={-16777216};
        for(int i=0;i<back.length;i++){
            if(back[i]==pixel) return true;
        }
        return false;
    }

    /**
     * 图片压缩
     * @param sourceImage 要压缩的图片
     * @return 压缩后的图片
     * @throws IOException 图片读写异常
     */
    public static BufferedImage compressImage(BufferedImage sourceImage) throws IOException{
        if(sourceImage==null) throw new NullPointerException("空图片");
        BufferedImage cutedImage=null;
        BufferedImage tempImage=null;
        BufferedImage compressedImage=null;
        Graphics2D g2D=null;
        //图片自动裁剪
        cutedImage=cutImageAuto(sourceImage);
        int width=cutedImage.getWidth();
        int height=cutedImage.getHeight();
        //图片格式为555格式
        tempImage=new BufferedImage(width, height, BufferedImage.TYPE_USHORT_555_RGB);
        g2D = (Graphics2D) tempImage.getGraphics();
        g2D.drawImage(sourceImage, 0, 0, null);
        compressedImage=getConvertedImage(tempImage);
        //经过像素转化后的图片
        compressedImage=new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
        g2D = (Graphics2D) compressedImage.getGraphics();
        g2D.drawImage(tempImage, 0, 0, null);
        int pixel[]=new int[width*height];
        int sourcePixel[]=new int[width*height];
        int currentPixel[]=new int[width*height];
        sourcePixel=cutedImage.getRGB(0, 0, width, height, sourcePixel, 0, width);
        currentPixel=tempImage.getRGB(0, 0, width, height, currentPixel, 0, width);
        for(int i=0;i<currentPixel.length;i++){
            if(i==0 || i==currentPixel.length-1){
                pixel[i]=0;
                //内部像素
            }else if(i>width && i<currentPixel.length-width){
                int bef=currentPixel[i-1];
                int now=currentPixel[i];
                int aft=currentPixel[i+1];
                int up=currentPixel[i-width];
                int down=currentPixel[i+width];
                //背景像素直接置为0
                if(isBackPixel(now)){
                    pixel[i]=0;
                    //边框像素和原图一样
                }else if((!isBackPixel(now) && isBackPixel(bef))
                        ||(!isBackPixel(now) && isBackPixel(aft))
                        ||(!isBackPixel(now) && isBackPixel(up))
                        ||(!isBackPixel(now) &&isBackPixel(down))
                        ){
                    pixel[i]=sourcePixel[i];
                    //其他像素和555压缩后的像素一样
                }else{
                    pixel[i]=now;
                }
                //边界像素
            }else{
                int bef=currentPixel[i-1];
                int now=currentPixel[i];
                int aft=currentPixel[i+1];
                if(isBackPixel(now)){
                    pixel[i]=0;
                }else if((!isBackPixel(now) && isBackPixel(bef))
                        ||(!isBackPixel(now) && isBackPixel(aft))){
                    pixel[i]=sourcePixel[i];
                }else{
                    pixel[i]=now;
                }
            }
        }
        compressedImage.setRGB(0, 0, width, height, pixel, 0, width);
        g2D.drawImage(compressedImage, 0, 0, null);
        ImageIO.write(cutedImage, "png", new File("cut/a_cut.png"));
        ImageIO.write(tempImage, "png", new File("cut/b_555.png"));
        ImageIO.write(compressedImage, "png", new File("cut/c_com.png"));
        return compressedImage;
    }

    /**
     * 图片自动裁剪
     * @param image 要裁剪的图片
     * @return 裁剪后的图片
     */
    public static BufferedImage cutImageAuto(BufferedImage image){
        Rectangle area=getCutAreaAuto(image);
        return image.getSubimage(area.x, area.y,area.width, area.height);
    }

    /**
     * 获得裁剪图片保留区域
     * @param image 要裁剪的图片
     * @return 保留区域
     */
    private static Rectangle getCutAreaAuto(BufferedImage image){
        if(image==null) throw new NullPointerException("图片为空");
        int width=image.getWidth();
        int height=image.getHeight();
        int startX=width;
        int startY=height;
        int endX=0;
        int endY=0;
        int []pixel=new int[width*height];

        pixel=image.getRGB(0, 0, width, height, pixel, 0, width);
        for(int i=0;i<pixel.length;i++){
            if(isCutBackPixel(pixel[i])) continue;
            else{
                int w=i%width;
                int h=i/width;
                startX=(w<startX)?w:startX;
                startY=(h<startY)?h:startY;
                endX=(w>endX)?w:endX;
                endY=(h>endY)?h:endY;
            }
        }
        if(startX>endX || startY>endY){
            startX=startY=0;
            endX=width;
            endY=height;
        }
        return new Rectangle(startX, startY, endX-startX, endY-startY);
    }

    /**
     * 当前像素是否为背景像素
     * @param pixel
     * @return
     */
    private static boolean isCutBackPixel(int pixel){
        int back[]={0,8224125,16777215,8947848,460551,4141853,8289918};
        for(int i=0;i<back.length;i++){
            if(back[i]==pixel) return true;
        }
        return false;
    }

    public static Dimension getImageDim(String path) {
        Dimension result = null;
        String suffix = getFileSuffix(path);
        //解码具有给定后缀的文件
        Iterator<ImageReader> iter = ImageIO.getImageReadersBySuffix(suffix);
        System.out.println(ImageIO.getImageReadersBySuffix(suffix));
        if (iter.hasNext()) {
            ImageReader reader = iter.next();
            try {
                ImageInputStream stream = new FileImageInputStream(new File(
                        path));
                reader.setInput(stream);
                int width = reader.getWidth(reader.getMinIndex());
                int height = reader.getHeight(reader.getMinIndex());
                result = new Dimension(width, height);
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                reader.dispose();
            }
        }
        System.out.println("call the method getImageDim() return result : " + result);
        return result;
    }


    private static String getFileSuffix(final String path) {
        String result = null;
        if (path != null) {
            result = "";
            if (path.lastIndexOf('.') != -1) {
                result = path.substring(path.lastIndexOf('.'));
                if (result.startsWith(".")) {
                    result = result.substring(1);
                }
            }
        }
        //logger.info("call the method getFileSuffix() return result : " + result);
        return result;
    }

    /**
     * 截取Dimension对象获得分辨率
     * @param path
     * @return
     */
    public static void getResolution2(String path) {
        String s = getImageDim(path).toString();
        s = s.substring(s.indexOf("[") + 1, s.indexOf("]"));
        String w = s.substring(s.indexOf("=") + 1, s.indexOf(","));
        String h = s.substring(s.lastIndexOf("=") + 1);
        String result = w + " x " + h;
        //return result;
    }

    public static void main(String[] args) {
        ImageUtil.reduceImg("/Users/joe/123.jpg", "/Users/joe/456.jpg", 900, 0);
        String path = "/Users/joe/123.jpg";
        long before = System.currentTimeMillis();
        Dimension dimension = getImageDim(path);
        System.out.println(dimension.getWidth() + "======" + dimension.getHeight());
        long after = System.currentTimeMillis();
        System.out.println((after - before) + "ms");
    }
}
