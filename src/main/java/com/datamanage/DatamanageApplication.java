package com.datamanage;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@EnableCaching
@ComponentScan(basePackages = {"com.datamanage.business.controller"})
@MapperScan(basePackages = {"com.datamanage.business.dao"})
public class DatamanageApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(DatamanageApplication.class);
        //关闭banner
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
