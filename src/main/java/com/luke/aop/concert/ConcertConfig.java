package com.luke.aop.concert;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan
@EnableAspectJAutoProxy
public class ConcertConfig {

	@Bean
	public Audience audience() {
		return new Audience();
	}

	@Bean
	public AnotherAudience anotherAudience() {
		return new AnotherAudience();
	}
}
