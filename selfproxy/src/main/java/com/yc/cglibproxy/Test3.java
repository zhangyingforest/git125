package com.yc.cglibproxy;


/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-01 21:16
 */
public class Test3 {
    public static void main(String[] args) {
        CglibProxyTool jpt=new CglibProxyTool(   new OrderBizImpl());
        OrderBizImpl ob= (OrderBizImpl) jpt.createProxy();  //
        System.out.println("生成代理类对象:"+   ob.toString() ); //  $$EnhancerByCGLIB$$sdfdsfdsf

        ob.findOrder();  //  $$EnhancerByCGLIB$$sdfdsfdsf. findOrder()
//
       ob.addOrder(1,99);
    }
}
