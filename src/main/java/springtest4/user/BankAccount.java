package springtest4.user;

import lombok.Data;
import org.springframework.beans.factory.config.BeanDefinition;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-26 20:34
 */
@Data   // lombok注解需要在idea中增加一个插件.
public class BankAccount {
    private int id;
    private double balance;

    BeanDefinition bd;


}
