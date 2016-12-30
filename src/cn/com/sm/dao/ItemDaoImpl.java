package cn.com.sm.dao;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.com.sm.po.Item;

/**
 * 继承SqlSessionDaoSupport类可以无需显式的注入sqlSessionFactory
 * @author user
 *	
 */
public class ItemDaoImpl extends SqlSessionDaoSupport implements ItemDao{
	
	/*private SqlSessionFactory sqlSessionFactory;*/
	/*//向dao实体类中注入sqlSessionFactory
	//通过构造器注入
	public ItemDaoImpl(SqlSessionFactory sqlSessionFactory){
		this.sqlSessionFactory=sqlSessionFactory;
	}*/
	@Override
	public Item findItemByIdTest(int id) throws IOException {
		// 通过工厂得到SqlSession 未将sqlsession定义为成员变量，因为sqlsession定义有成员变量域，线程不安全
		SqlSession session = this.getSqlSession();
		// 通过session操作数据库
		Item item = session.selectOne("test.queryItemById", 1);
		return item;
	}
	/*public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}*/
	
}
