package com.yc.biz;

import com.yc.bean.Account;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-08-02 14:14
 */
public interface AccountBiz {
    /**
     * 银行开户
     * @param money
     * @return
     */
    public Account openAccount(double money );

    public Account deposite(int accountid, double money);

    /**
     * 存款: 给accountid存入 money,并返回最后的余额信息
     */
     Account deposite(  int accountid, double money ,  Integer transferId );

    public Account withdraw(  int accountid, double money);
    /**
     * 取款: 给accountid取出money,并返回最后的余额信息
     */
    public Account withdraw(  int accountid, double money ,  Integer transferId );

    /**
     * 从accountId中转出money到toAccountId账户
     * @param accountId
     * @param money
     * @param toAccountId
     * @return
     */
    public Account transfer(   int accountId,  double money,  int toAccountId  );

    /**
     * 查询是否存在accountId账户
     * @param accountId
     * @return
     */
    public Account findAccount( int accountId);
}

