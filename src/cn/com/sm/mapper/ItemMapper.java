package cn.com.sm.mapper;

import java.io.IOException;

import cn.com.sm.po.Item;


public interface ItemMapper {

	public Item queryItemById(int id) throws IOException;
}
