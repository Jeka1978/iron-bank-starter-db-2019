package db.com.gameofthrones.ironbankstarter;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@ConfigurationProperties(prefix = "raven")
@Data
public class RavenProperties {
    private String destination;
    private String name;
}
