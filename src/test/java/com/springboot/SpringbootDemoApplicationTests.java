package com.springboot;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)//底层用的是junit SpringJUnit4ClassRunner
@SpringBootTest(classes = {SpringbootDemoApplication.class})//启动整个springboot项目
public class SpringbootDemoApplicationTests {

	@Test
	public void contextLoads() {
		System.out.print("test hello");
		TestCase.assertEquals(1,1);
	}
	@Test
	public void contextLoadsMore() {
		System.out.print("test hello");
		TestCase.assertEquals(1,1);
	}
	@Before
	public void contextLoadsBefore() {
		System.out.print("Before");
		TestCase.assertEquals(1,1);
	}
	@After
	public void contextLoadsAfter() {
		System.out.print("After");
		TestCase.assertEquals(1,1);
	}

}
