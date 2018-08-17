/**
 * 
 */
package io.vipin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author VI852115
 *
 */
@EnableGlobalMethodSecurity
@EnableWebSecurity
@ComponentScan(basePackages = "io.vipin")
@Configuration
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	 
	@Override
	public void configure(HttpSecurity httpSecurity) throws Exception{
		
			httpSecurity.csrf().disable();
			httpSecurity.authorizeRequests()
			.antMatchers("**/secured/**").authenticated()
			.anyRequest().permitAll();
	}
	
	
	
}
