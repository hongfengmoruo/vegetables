package com.system.vegetables;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.system.vegetables.mapper")
public class VegetablesApplication {

    public static void main(String[] args) {
        SpringApplication.run(VegetablesApplication.class, args);
    }

}
