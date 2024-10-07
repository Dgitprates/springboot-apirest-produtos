package com.produtos.apirest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI productApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("Produtos API REST")
                        .description("API REST de cadastro de produtos.")
                        .version("1.0")
                        .termsOfService("Terms of Service")
                        .contact(new Contact()
                                .name("Diego Prates")
                                .url("https://github.com/Dgitprates")
                                .email("diegolprates@gmail.com"))
                        .license(new io.swagger.v3.oas.models.info.License()
                                .name("Apache License Version 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
