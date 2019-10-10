package com.xf._10_springboot_swagger.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:33 2019/10/10
 * @description :Swagger配置类
 */
@Configuration
@EnableSwagger2
public class Swagger2Configuration {

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())//基本配置
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xf.controller")) //apis()指定扫描的包会生成文档
                .paths(PathSelectors.any())
                .build();
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("springboot利用swagger构建api文档")
                .description("简单优雅的restful风格，https://me.csdn.net/qq_39818325")
                .termsOfServiceUrl("https://me.csdn.net/qq_39818325")
                .version("1.0")
                .build();
    }
}
