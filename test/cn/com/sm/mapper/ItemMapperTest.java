package cn.com.sm.mapper;


import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.po.Item;


public class ItemMapperTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testQueryItemById() throws IOException {
		ItemMapper im=(ItemMapper) applicationContext.getBean("itemMapper");
		Item item=im.queryItemById(3);
		System.out.println(item);
	}

}
