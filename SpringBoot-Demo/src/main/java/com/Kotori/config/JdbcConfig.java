package com.Kotori.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfig {
    @Autowired
    JdbcProperties jdbcProperties;

    @Bean
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriver());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setPassword(jdbcProperties.getPassword());
        dataSource.setUsername(jdbcProperties.getUsername());
        return dataSource;
    }
}
