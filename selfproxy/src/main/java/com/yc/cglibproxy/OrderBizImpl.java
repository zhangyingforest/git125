package com.yc.cglibproxy;

/**
 * @program: git125
 * @description: 目标类
 * @author: zy
 * @create: 2023-08-01 18:43
 */
public class OrderBizImpl  {

    public void addOrder(int pid, int num) {
        System.out.println("添加订单,添加了:"+pid+",数量为:"+num);
    }

    public void findOrder() {
        System.out.println("查询订单");
    }

}
