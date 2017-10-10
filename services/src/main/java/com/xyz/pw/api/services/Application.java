package com.xyz.pw.api.services;

import com.xyz.pw.api.services.config.MultitenancyProperties;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * The Class Application.
 */
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class}, scanBasePackages = {"com.xyz.pw.api", "com.kastkode.springsandwich.filter"})
@EnableConfigurationProperties(MultitenancyProperties.class)
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableTransactionManagement(proxyTargetClass = true)
public class Application extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    ReflectionToStringBuilder.setDefaultStyle(ToStringStyle.MULTI_LINE_STYLE);
    return application.sources(Application.class);
  }

  /**
   * Class that can be used to bootstrap and launch a Spring application from a Java main method.
   *
   * @param args the arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args); // NOSONAR
  }

  /**
   * Adapter.
   *
   * @return the web mvc configurer adapter
   */
  @Bean
  public WebMvcConfigurerAdapter adapter() {
    return new WebMvcConfigurerAdapter() {
      @Override
      public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/dist/**").addResourceLocations("classpath:/dist/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static");
      }
    };
  }

}
