package com.edu.ue.EigthProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//LUIS SANTIAGO FORERO HEREDIA
@SpringBootApplication
public class EigthProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(EigthProjectApplication.class, args);
    }
    @Bean
    public RestTemplate template(){
        return new RestTemplate();
    }
}
