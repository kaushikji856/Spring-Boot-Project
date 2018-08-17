/**
 * 
 */
package io.vipin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author VI852115
 *
 */

@EnableEurekaClient
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer {

	/**
	 * @param args
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MainApplication.class);
	}

	
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	
}
