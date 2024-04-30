package com.example.bankingappd14cw2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class OpenApiConfig<Docket> {

    @Bean
    public Docket api() {
        Object RequestHandlerSelectors;
        Object PathSelectors;
        return ((Object) new Docket(DocumentationType.SWAGGER_2))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.examly.springapp.controller"))
                .paths(((Object) PathSelectors).any())
                .build();
    }
}
