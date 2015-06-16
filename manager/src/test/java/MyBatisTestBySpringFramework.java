import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by joe on 15/6/11.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:springmybatis/spring-context.xml", "classpath:springmybatis/spring-mybatis.xml"})
public class MyBatisTestBySpringFramework {

    //注入userService
//    @Autowired
//    private UserServiceI userService;

    @Test
    public void testAddUser(){

    }

    @Test
    public void testGetUserById(){

    }
}