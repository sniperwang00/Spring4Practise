package com.luke.test;

import com.luke.aop.concert.ConcertConfig;
import com.luke.aop.concert.Performance;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ConcertConfig.class)
public class ConcertTest {

	@Autowired
	private Performance performer;

	@Test
	public void test() {
		performer.perform();
	}
}
