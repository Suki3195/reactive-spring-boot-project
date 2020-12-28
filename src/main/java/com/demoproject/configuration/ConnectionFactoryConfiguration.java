package com.demoproject.configuration;

import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.r2dbc.core.DatabaseClient;

@Configuration
public class ConnectionFactoryConfiguration {

    @Bean
    public  ConnectionFactory connectionFactory(){
        PostgresqlConnectionConfiguration config = PostgresqlConnectionConfiguration.builder()
                .database("my_college")
                .password("Mahadev@3195")
                .username("root")
                .host("localhost")
                .port(3306)
                .build();
        return new PostgresqlConnectionFactory(config);

    }

    @Bean
    public DatabaseClient databaseClient(){
        return DatabaseClient.create(connectionFactory());
    }


}
