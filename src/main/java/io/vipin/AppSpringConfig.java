/**
 * 
 */
package io.vipin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author VI852115
 *
 */
public class AppSpringConfig {

	@Configuration	
	@EnableAspectJAutoProxy
	@ComponentScan(basePackages = "io.vipin")
	public class AppConfig {
	 
	}	

}
