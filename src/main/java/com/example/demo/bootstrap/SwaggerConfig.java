//package com.example.demo.bootstrap;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import static springfox.documentation.builders.PathSelectors.regex;
//
//@Configuration
//@EnableWebMvc
//@EnableSwagger2
//@Component
//public class SwaggerConfig {
//
//    @Bean
//    public Docket api() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                // you can customize package
////                .apis(RequestHandlerSelectors.basePackage("com.exceptionly.tutorials.demo.controller"))
//                .apis(RequestHandlerSelectors.any())
//                // you can customize path
////                .paths(regex("/customer/.*"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//}