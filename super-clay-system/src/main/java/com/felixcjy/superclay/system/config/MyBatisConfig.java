package com.felixcjy.superclay.system.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: Felix(蔡济阳)
 * @since : 2025/1/23 15:50
 */
@Configuration
@MapperScan(basePackages = "com.felixcjy.superclay.system.mapper")
public class MyBatisConfig {
}
