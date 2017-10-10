package com.xyz.pw.api.services.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

  @Bean
  public ModelMapper modelMapper() {
    return new ModelMapper();
  }


}