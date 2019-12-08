package com.wpg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.wpg.mapper")
public class SpringbootmpmvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootmpmvcApplication.class, args);
    }

}
