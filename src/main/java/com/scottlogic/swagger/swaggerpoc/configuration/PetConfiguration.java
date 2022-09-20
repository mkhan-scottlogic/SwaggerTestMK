package com.scottlogic.swagger.swaggerpoc.configuration;

import com.scottlogic.generated.pet.invoker.ApiClient;
import com.scottlogic.generated.pet.rest.api.PetApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan(basePackages = "com.scottlogic.generated.pet")
public class PetConfiguration {
//    @Bean
//    public ApiClient apiClient() {
//        return new ApiClient();
//    }
//
//    @Bean
//    public PetApi petApi() {
//        return new PetApi(apiClient());
//    }
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
