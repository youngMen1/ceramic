package com.ceramic.ceramicrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zhiqiang.feng
 * @version 1.0
 * @date-time 2019/02/13-15:01
 * @description
 **/
@EnableSwagger2
@SpringBootApplication
public class CeramicRestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CeramicRestApiApplication.class, args);
    }

}
