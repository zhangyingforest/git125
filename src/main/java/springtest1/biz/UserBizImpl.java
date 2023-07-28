package springtest1.biz;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import springtest1.dao.UserDao;

import javax.annotation.Resource;

@Service
@Scope
public class UserBizImpl implements UserBiz {
    //将dao层的对象注入到biz  DI依赖注入  ( 将spring容器中托管的 userDao的对象传到此处)
    @Resource(name="userDaoImpl")   //由spring容器根据  id名为 userDaoImpl到容器中找这个实例，并注入》

    @Autowired    //根据类型来完成注入. 在spring容器中根据类型 UserDao接口类找实例
    @Qualifier("userDaoImpl")
    private UserDao userDao;

    public UserBizImpl(){
        System.out.println("userBizImpl的构造");
    }


    @Override
    public void add(String uname) {
        userDao.add(   uname );
    }
}
