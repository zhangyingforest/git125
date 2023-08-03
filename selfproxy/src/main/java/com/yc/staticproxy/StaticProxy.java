package com.yc.staticproxy;

/**
 * @program: git125
 * @description: 静态代理类
 * @author: zy
 * @create: 2023-08-01 18:44
 */
public class StaticProxy implements  OrderBiz{
    //目标类的引用,利用setXxx,或构造方法   注入.
    private OrderBiz orderBiz;

    public StaticProxy(OrderBiz orderBiz) {
        this.orderBiz = orderBiz;
    }

    @Override
    public void addOrder(int pid, int num) {
        //前置增强
        showHello();
        this.orderBiz.addOrder(  pid, num);
        //后置增强
        showBye();
    }

    @Override
    public void findOrder() {
        this.orderBiz.findOrder();   //没有任何增强
    }

    //增强
    public void showHello(){
        System.out.println(   "hello");
    }
    //增强
    public void showBye(){
        System.out.println(  "bye");
    }


}
