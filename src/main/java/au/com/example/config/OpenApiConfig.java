package au.com.example.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI orderApi() {
        return new OpenAPI().info(new Info()
                .title("Order Service")
                .description("All apis relating to orders")
                .version("0.1.0"));
    }
}
