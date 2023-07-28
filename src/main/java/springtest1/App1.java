package springtest1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtest1.biz.UserBiz;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-25 16:43
 */
public class App1 {
    public static void main(String[] args) {
        //首先创建容器
        //  ClassPathXmlApplicationContext   类路径下有一个xml文件来配置,来生成容器
        //  FileSystemXmlApplicationContext   FileSystem任意路径(c:/... ) 文件系统路径下的xml配置文件 来生成容器
        //  AnnotationConfigApplicationContext  读取注解的类( @Configuration ), 生成容器
        ApplicationContext container=new AnnotationConfigApplicationContext(    Config.class );
        //容器中已经创建好了这个类   "键: userDaoImpl"   值：是对象
       // UserDao ud= (UserDao) container.getBean(  "userDaoImpl"  );
       // ud.add("张三");

        //取业务层的类
        UserBiz ub= (UserBiz) container.getBean("userBizImpl");
        ub.add("王五");

        /////////////////////////////////////////////////
       // UserDao udd=new UserDaoImpl();
        //udd.add("李四");
    }
}
