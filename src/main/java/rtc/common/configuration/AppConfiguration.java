package rtc.common.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class AppConfiguration {

    @Value("${api.base.url}")
    private String apiBaseUrl;

    @Value("${api.auth.header}")
    private String authHeader;

    
    @Bean
    public WebClient getWebClientInstance(){
            return WebClient.builder()
            .baseUrl(apiBaseUrl)
            .defaultHeader("Authorization", authHeader)
            .build();
    }

    @Bean
    public WebClient.Builder webClient(){
        return WebClient.builder();
    }
}
