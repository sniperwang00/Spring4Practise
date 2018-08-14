package com.luke.beans;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Count {
	private int countNum = 1;

	public String pi;

	public String firstName;

	public String lastName;

	public Count(@Value("${firstName}")String firstName, @Value("${lastName}") String lastName,
				 @Value("#{T(java.lang.Math).PI}")String pi) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.pi = pi;
	}

	public int add() {
		return countNum += 1;
	}

	public int minus() {
		return countNum -=1;
	}
}
