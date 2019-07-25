package com.homepet.petapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ImportResource;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ImportResource("classpath:config/*.xml")
@EnableSwagger2
public class PetApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(PetApiApplication.class, args);
    }

}
