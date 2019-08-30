package db.com.gameofthrones.ironbankstarter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.SpringFactoriesLoader;

/**
 * @author Evgeny Borisov
 */
@Configuration
@EnableConfigurationProperties(RavenProperties.class)
public class IronBankStarterConfig {

    @Bean
    @ConditionalOnProduction
    @ConditionalOnProperty("raven.destination")
    public IronBankRavenApplicationListener ravenApplicationListener(){
        return new IronBankRavenApplicationListener();
    }

    @Bean
    public FrontendControllerHandler frontendControllerAspect(){
        return new FrontendControllerHandler();
    }
}








