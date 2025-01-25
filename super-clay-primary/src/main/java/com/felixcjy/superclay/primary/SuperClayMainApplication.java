package com.felixcjy.superclay.primary;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.felixcjy.superclay.system"})
public class SuperClayMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(SuperClayMainApplication.class, args);
    }
}