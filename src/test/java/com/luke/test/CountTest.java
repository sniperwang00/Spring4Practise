package com.luke.test;

import com.luke.beans.Count;
import com.luke.beans.CountConfig;
import com.luke.beans.PreLoadBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CountConfig.class)
public class CountTest {

	@Autowired
	private Count count;

	@Autowired
	private PreLoadBean loadBean;

	@Test
	public void testCountAdd(){
		assertEquals(2, count.add());
		assertEquals(3, count.add());
		assertEquals(4, count.add());
		assertEquals(5, count.add());

	}

	@Test
	public void testLoadProperties() {
		assertNotNull(loadBean);
		assertNotNull(loadBean.env);
		assertEquals("aaa", loadBean.env.getProperty("firstProperty"));
	}

}
