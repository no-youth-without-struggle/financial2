package com.group8;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.group8.financial2.mapper")
@MapperScan("com.group8.afterendfinancial2.mapper")
public class Financial2Application {

    public static void main(String[] args) {
        SpringApplication.run(Financial2Application.class, args);
    }

}
