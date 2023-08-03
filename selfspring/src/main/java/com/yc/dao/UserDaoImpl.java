package com.yc.dao;

import org.ycframework.annotation.YcLazy;
import org.ycframework.annotation.YcRepository;

@YcRepository  // "userDaoImpl"  ->对象
@YcLazy
//@YcScope(value="prototype")
public class UserDaoImpl implements UserDao{

    @Override
    public void add(String uname){
        System.out.println(  "dao添加了"+uname );
    }
}
