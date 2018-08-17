package io.vipin;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

	@Configuration
	@EnableAspectJAutoProxy
	@ComponentScan(basePackages="io.vipin")
	public class AspectConfig {
	}
