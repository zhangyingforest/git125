package com.yc;

import com.yc.biz.AccountBiz;
import com.yc.configs.Config;
import junit.framework.TestCase;
import lombok.extern.log4j.Log4j2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//测试用例一: 测试   AccountBiz的使用.
//  ApplicationContext ac=new AnnotationConfigApplicationContext(  Config.class);
@RunWith(   SpringJUnit4ClassRunner.class   )
@ContextConfiguration(   classes= Config.class )
@Log4j2
public class Test1 extends TestCase {
    //也可以在这里完成DI
    @Autowired
    private AccountBiz accountBiz;

    //单元测试用例
    @Test
    public void testAddAccount(){
        log.info("hello");
       // accountBiz.addAccount( 1, 99);
    }

    //引入断言:
    @Test
    public void testAdd(){
        int x=30, y=4;
        Assert.assertEquals(     7, x+y      );
    }
}
