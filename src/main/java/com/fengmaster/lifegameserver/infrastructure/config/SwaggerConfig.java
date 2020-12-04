package com.fengmaster.lifegameserver.infrastructure.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Feng-master on 20/03/23.
 */
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI xcpmsAPI() {
        return new OpenAPI()
                .components(new Components().addSecuritySchemes("X-CSRF-TOKEN", new SecurityScheme().type(SecurityScheme.Type.APIKEY).in(SecurityScheme.In.HEADER).name("X-CSRF-TOKEN").scheme("X-CSRF-TOKEN")))
                .info(new Info().title("LIFE_GAME").description("").contact(new Contact().name("fengmaster").url("")).version("V0.1.0"));
    }

}
