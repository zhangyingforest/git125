package com.yc.staticproxy;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-01 18:48
 */
public class Test {
    public static void main(String[] args) {
        OrderBiz ob=new StaticProxy(    new OrderBizImpl()    );
        ob.addOrder(   1, 100);
    }
}
