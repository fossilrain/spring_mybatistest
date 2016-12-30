package cn.com.sm.dao;

import java.io.IOException;

import cn.com.sm.po.Item;

public interface ItemDao {

	public Item findItemByIdTest(int id) throws IOException;
}
