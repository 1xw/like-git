package com.lxw.utils;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * description
 *
 * @author lxw 2019/07/22 19:41
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.lxw"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo()
    {

        return new ApiInfoBuilder()
                .title("集成Swagger2构建RestFul Apis")
                .description("这是用来继承swaffer2构建RestFulApis")
                .termsOfServiceUrl("http://www.baidu.com")
                .contact(new Contact("engoy","www.baidu.com","281249249@qq.com"))
                .version("2.2.0")
                .build();
    }


}
