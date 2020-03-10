package com.example.toodo.application.todo.central.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class TodoCentralConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(TodoCentralConfigApplication.class, args);
    }

}
