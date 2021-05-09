package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author
 * @date 2020/12/6 13:17
 * @Description springboot启动类
 * @return
 */

@SpringBootApplication
@MapperScan("com.mapper")
public class StartApplication {

    public static void main(String[] args){
        SpringApplication.run(StartApplication.class, args);
    }
}
