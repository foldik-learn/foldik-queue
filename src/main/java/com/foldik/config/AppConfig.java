package com.foldik.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

@Configuration
public class AppConfig {

    @Bean
    public Queue<String> messageHolder() {
        return new ArrayBlockingQueue<String>(2000);
    }
}
