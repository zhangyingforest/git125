package com;

import com.yc.Config;
import com.yc.biz.OrderBiz;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-01 08:55
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
        OrderBiz ob=ac.getBean(OrderBiz.class);
        //ob.makeOrder(1, 99);
        //ob.findOrderId(   "apple" );
       // ob.findOrderId(   "apple" );
        //ob.findOrderId(   "pear" );

     //   ob.findOrderId("apple");
       ob.findPid("apple");
//        ob.findPid("apple");
//        ob.findPid("pear");

        //ob.makeOrder(1,   9999);

    }
}
