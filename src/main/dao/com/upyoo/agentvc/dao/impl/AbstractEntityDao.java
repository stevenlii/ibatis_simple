package com.upyoo.agentvc.dao.impl;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.upyoo.agentvc.dao.EntityDao;

public class AbstractEntityDao<T> implements EntityDao<T>{
	static SqlMapClient sqlMap = null;
	
static{
String config = "sqlMapConfig.xml";
	
	Reader reader;
	try {
		reader = Resources.getResourceAsReader(config);
		sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
	@Override
	public void save(String id, T t) {
		try {
			sqlMap.insert(id, t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<T> query() {
		// TODO Auto-generated method stub
		return null;
	}}
