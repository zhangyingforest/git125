package com.yc.biz;

import com.yc.bean.Account;
import com.yc.configs.Config;
import com.yc.configs.DataSourceConfig;
import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.TransactionManager;

@RunWith(   SpringJUnit4ClassRunner.class   )
@ContextConfiguration(   classes= {Config.class, DataSourceConfig.class})
@Log4j2
public class AccountBizImplTest extends TestCase {
    @Autowired
    private AccountBiz accountBiz;

    @Test
    public void findAccount() {
       Account a=accountBiz.findAccount(31  );
        Assert.assertNotNull(   a );
        log.info(   a );
    }

    @Test
    public void openAccount() {
        Account a=accountBiz.openAccount(   100);
        Assert.assertNotNull(   a );
        log.info(   a );
    }

    @Test
    public void deposite() {
        Account a=accountBiz.deposite( 33, 1);
        Assert.assertNotNull(   a );
        log.info(   a );
    }

    @Autowired
    private TransactionManager tx;

    @Test
    public void withdraw() {

        log.info( ((DataSourceTransactionManager)tx).getDataSource() );
        Account a=accountBiz.withdraw( 33, 10000);
        Assert.assertNotNull(   a );
        log.info(   a );
    }

    @Test
    public void transfer() {
       Account a= accountBiz.transfer(   33,20000, 32);
        Assert.assertNotNull(   a );
        log.info(   a );
    }
}