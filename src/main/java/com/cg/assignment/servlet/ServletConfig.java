package com.cg.assignment.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServletConfig {
    @Bean
    public ServletRegistrationBean<Servlet1> page1ServletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new Servlet1(), "/page1");
    }

    @Bean
    public ServletRegistrationBean<Servlet2> page2ServletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new Servlet2(), "/page2");
    }

    @Bean
    public ServletRegistrationBean<Servlet3> page3ServletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new Servlet3(), "/page3");
    }

    @Bean
    public ServletRegistrationBean<Servlet4> page4ServletServletRegistrationBean() {
        return new ServletRegistrationBean<>(new Servlet4(), "/page4");
    }
}