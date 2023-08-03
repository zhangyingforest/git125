package com.yc.jdkproxy;

import com.yc.staticproxy.OrderBiz;
import com.yc.staticproxy.OrderBizImpl;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-01 19:24
 */
public class Test2 {
    public static void main(String[] args) {
        //设置代理生成的字节码 保存到当前目录
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        JdkProxyTool jpt=new JdkProxyTool(   new OrderBizImpl());
        OrderBiz  ob= (OrderBiz) jpt.createProxy();  // $Proxy0
      //  System.out.println("生成代理类对象:"+   ob.toString() ); //  $Proxy0@561   com.yc.staticproxy.OrderBizImpl@2f0e140b

        ob.findOrder();  //   $Proxy0.findOrder()

        ob.addOrder(1,99);
    }
}
