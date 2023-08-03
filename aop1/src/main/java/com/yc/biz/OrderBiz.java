package com.yc.biz;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-01 08:52
 */
public interface OrderBiz {

    public void makeOrder(  int pid, int num);

    public int findOrderId(   String pname   );

    public int findPid(String pname);
}
