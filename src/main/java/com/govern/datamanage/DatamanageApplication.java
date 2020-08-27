package com.govern.datamanage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.govern.datamanage.controller"})
public class DatamanageApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatamanageApplication.class, args);
    }

}
