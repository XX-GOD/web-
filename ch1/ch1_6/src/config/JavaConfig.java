package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.MyService;

@Configuration
public class JavaConfig {
    @Bean(initMethod = "initService",destroyMethod = "destroyService")
    public MyService getMyService() {
        return new MyService();
    }
}
