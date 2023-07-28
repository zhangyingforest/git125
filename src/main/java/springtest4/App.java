package springtest4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import springtest4.user.BankAccount;
import springtest4.user.BankAccountDao;

import java.sql.SQLException;
import java.util.List;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-26 11:52
 */
public class App {
    public static void main(String[] args) throws SQLException {
        ApplicationContext ac=new AnnotationConfigApplicationContext(   Config.class);
//        DataSource ds= (DataSource) ac.getBean("myDataSource");
//
//        Connection con=ds.getConnection();
//        System.out.println(   con );

        BankAccountDao bad= (BankAccountDao) ac.getBean("bankAccountDao");
        List<BankAccount> list=bad.findAll();
        for(  BankAccount ba:list){
            System.out.println(  ba );
        }
    }
}
