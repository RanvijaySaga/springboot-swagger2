package com.spring.play.swagger2.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

/**
 * @implNote In plain Spring projects, we need to enable Swagger 2 explicitly. To do so, we have to use the @EnableSwagger2 on our configuration class:
 * Additionally, without Spring Boot, we don’t have the luxury of auto-configuration of our resource handlers.
 * <p>
 * Swagger UI adds a set of resources that we must configure as part of a class that extends WebMvcConfigurerAdapter and is annotated with @EnableWebMvc:
 */
@Configuration
public class SwaggerConfig {

    /**
     * @return Docket
     * @implNote The Docket bean is the main bean to configure Swagger. It returns a prepared instance of Docket that is a builder for the API Documentation.
     */
    @Bean
    public Docket api() {
        /*
        After defining the Docket bean, its select() method returns an instance of ApiSelectorBuilder,
        which provides a way to control the endpoints exposed by Swagger.

        We can configure predicates for selecting RequestHandlers with the help of RequestHandlerSelectors and PathSelectors.
        Using any() for both will make documentation for our entire API available through Swagger.
         */
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any()) // use of RequestHandlerSelectors.basePackage(basepackage) to expose api inside the base package
                .paths(PathSelectors.any()).build().apiInfo(apiInfo()); // use PathSelectors.ant("/api/*") to filter api with /api/ path

    }

    /**
     *
     * @return
     * @implNote Api Documentation customization
     */
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "SpringBootApplication with Swagger 2",
                "Employee Management API",
                "1.0.0",
                "Terms of service",
                new Contact("Ranvijay Singh", "ranvijay.saga.com", "ranvijay.saga@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }
}
