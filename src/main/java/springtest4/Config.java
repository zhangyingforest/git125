package springtest4;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"springtest4.datasource","springtest4.jdbcTemplate","springtest4.user"})

@PropertySource(value="classpath:db.properties")   // spring启动时  PropertySource 类扫描   classpath:db.properties
                                                  //以键值对存
public class Config {

//    @Bean(value="ds")    //   "myDataSource" ->对象
//    public DataSource myDataSource(){
//        return new MyDataSource();
//    }

}
