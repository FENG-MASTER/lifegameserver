package com.fengmaster.lifegameserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
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
 * Created by Feng-master on 20/03/23.
 */
@Configuration
@EnableSwagger2
@ComponentScan(basePackages = "com.fengmaster.lifegameserver.controller")
public class SwaggerConfig {
    @Bean
    public Docket customDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiinfo()).select().apis(RequestHandlerSelectors.any()).paths(PathSelectors.any()).build();
    }

    private ApiInfo apiinfo(){
        Contact contact=new Contact("FENGMASTER","http://github.com/FENG-MASTER","554286238@qq.com");
        return new ApiInfoBuilder().contact(contact).title("游戏人生").description("游戏人生后restful接口").build();
    }



}
