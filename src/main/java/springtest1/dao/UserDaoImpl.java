package springtest1.dao;

import org.springframework.stereotype.Repository;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-25 16:37
 */
@Repository   // @Repository标识这是一个dao层的类，由spring托管
              //  @Component                    由spring托管
public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("UserDaoImpl类的构造...");
    }

    @Override
    public void add(String uname) {
        System.out.println( "添加了:"+uname);
    }
}
