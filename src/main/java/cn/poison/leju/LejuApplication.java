package cn.poison.leju;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * SpringBoot启动类
 *
 * @Tools Created by IntelliJ IDEA.
 * @author: dongxiaojun<dongxiaojun @ 1 6 3 . com>
 * @Date: 2020/6/11 14:19
 */

@SpringBootApplication(exclude={DruidDataSourceAutoConfigure.class})
public class LejuApplication {

    public static void main(String[] args) {
        SpringApplication.run(LejuApplication.class, args);
    }

}
