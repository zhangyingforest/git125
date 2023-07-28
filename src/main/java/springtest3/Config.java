package springtest3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @program: git125
 * @description:
 * @author: zy
 * @create: 2023-07-26 09:44
 */
@Configuration
@ComponentScan(basePackages = {"springtest3.system","springtest3.user"})
public class Config {
}
