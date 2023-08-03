package com.yc;


import com.yc.service.UserBiz;
import org.ycframework.context.YcAnnotationConfigApplicationContext;
import org.ycframework.context.YcApplicationContext;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-27 14:17
 */
public class TestMain2 {
    public static void main(String[] args) {
//        Logger logger= LoggerFactory.getLogger(   TestMain2.class );
//        logger.error("error");
//        logger.warn("warn");
//        logger.info("info");
//        logger.debug("debug");
//        logger.trace("trace");

        YcApplicationContext ac=new YcAnnotationConfigApplicationContext(MyConfig.class);
        UserBiz ub= (UserBiz) ac.getBean("ub");
        ub.add("张三");
    }
}