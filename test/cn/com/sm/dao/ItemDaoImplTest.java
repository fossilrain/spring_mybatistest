package cn.com.sm.dao;


import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.sm.po.Item;


public class ItemDaoImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
	}

	@Test
	public void testFindItemByIdTest() throws IOException {
		ItemDao itemDao = (ItemDao) applicationContext.getBean("itemDao");
		Item item=itemDao.findItemByIdTest(1);
		System.out.println("..."+item);
	}

}
