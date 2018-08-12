package com.luke.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class Count {
	private int countNum = 1;

	public int add() {
		return countNum += 1;
	}

	public int minus() {
		return countNum -=1;
	}
}
