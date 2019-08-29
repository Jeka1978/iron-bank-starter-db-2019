package db.com.gameofthrones.ironbankstarter;

import org.springframework.context.annotation.Import;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author Evgeny Borisov
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(IronBankStarterConfig.class)
public @interface EnableIronBankStarter {
}
