package com.co.ias.Dbconfig;

import org.springframework.boot.jdbc.DataSourceBuilder;

public class DataSource {

    public DataSource dataSource(){
        return (DataSource) DataSourceBuilder.create()
                .driverClassName("org.h2.Driver")
                .url("jdbc:h2:mem:userdb")
                .username("sa")
                .password("password")
                .build();

    }
}
