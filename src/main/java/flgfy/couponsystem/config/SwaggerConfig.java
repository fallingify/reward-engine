package flgfy.couponsystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Coupon Issuer API")
                        .description("정책형 쿠폰(POLICY_250K) 발급 시스템")
                        .version("v1.0"));
    }
}