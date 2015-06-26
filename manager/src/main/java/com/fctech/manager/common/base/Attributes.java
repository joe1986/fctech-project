package com.fctech.manager.common.base;

/**
 * Created by joe on 15/6/24.
 */
public class Attributes extends BaseDTO {

     public void Attributes(int level){
        this.level = level;
    } 
    
    /**
     * 
     */
    private static final long serialVersionUID = -3283477782014101210L;
    /** 级别 */
    int level;
  
    public Attributes(int level){
        this.level = level;
    }
    
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
