package com.luke.aop.concert;

import org.springframework.stereotype.Component;

@Component
public class BonJovi implements Performance{
	public void perform() {
		System.out.println("BonJovi is playing");
	}
}
