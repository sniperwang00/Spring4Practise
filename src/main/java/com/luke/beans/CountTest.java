package com.luke.beans;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

public class CountTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountConfig.class);
		Count count = context.getBean(Count.class);

		System.out.println(count.add());

		Count count1 = context.getBean(Count.class);

		System.out.println(count1.add());

		Count count2 = context.getBean(Count.class);

		System.out.println(count2.add());

		Count count3 = context.getBean(Count.class);

		System.out.println(count3.add());

		Count count4 = context.getBean(Count.class);

		System.out.println(count4.add());

		Count count5 = context.getBean(Count.class);

		System.out.println(count5.add());
	}
}
