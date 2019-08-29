package db.com.gameofthrones.ironbankstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * @author Evgeny Borisov
 */
public class IronBankRavenApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private RavenProperties ravenProperties;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("ворон полетел в " + ravenProperties.getDestination());
    }
}
