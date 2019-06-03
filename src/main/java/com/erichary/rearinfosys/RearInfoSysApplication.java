package com.erichary.rearinfosys;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yanglichao
 */
@SpringBootApplication
@MapperScan(basePackages = "com.erichary.rearinfosys.dao.mapper")
public class RearInfoSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(RearInfoSysApplication.class, args);
    }

}
