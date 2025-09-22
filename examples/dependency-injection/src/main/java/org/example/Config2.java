package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config2 {

    @Bean
    public Integer intBean(String stringBean) {
        if(stringBean.isBlank()){
            return 4;
        }
        return 5;
    }

}
