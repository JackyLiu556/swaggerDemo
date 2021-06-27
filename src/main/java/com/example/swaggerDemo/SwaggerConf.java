package com.example.swaggerDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConf {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .tags(new Tag("UserController", "類別檔案說明"),new Tag("TestController", "測試檔案說明"))
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.swaggerDemo"))
                .paths(PathSelectors.any())//paths(PathSelectors.regex("/.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("標題:Spring Boot中使用Swagger2建構RESTful APIs")
                .description("相關說明")
                .termsOfServiceUrl("https://www.pixnet.net/pcard/B0212066/")
                .license("Jacky's Blog")
                .licenseUrl("https://jackyliu556.github.io/")
                .version("1.0.0")
                .build();
    }
}