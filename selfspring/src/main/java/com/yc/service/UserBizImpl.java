package com.yc.service;

import com.yc.dao.UserDao;
import org.ycframework.annotation.YcResource;
import org.ycframework.annotation.YcService;

@YcService("ub")
//@YcLazy
public class UserBizImpl implements UserBiz {

    @YcResource(name="userDaoImpl")
    private UserDao userDao;

//    @YcResource(name="userDaoImpl")
//    public void setUserDao(UserDao userDao){
//        this.userDao=userDao;
//    }
//
//    @YcResource(name="userDaoImpl")
//    public UserBizImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void add(String uname) {
        userDao.add(uname);
    }
}
