package com.upyoo.test;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.upyoo.vmware.viewandmodel.VCenterViewModel;
public class IBatisDemo2 {
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
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		VCenterViewModel center = new VCenterViewModel();
		center.setId("fortest2");
		center.setCluster_count(18);
		center.setDescription_name("tes1t");
		try {
			sqlMap.insert("insertvcenterviewmodel", center);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		List<VCenterViewModel> list;
		try {
			list = sqlMap.queryForList("checkFromVCenterViewModel");
			for (VCenterViewModel vCenterViewModel : list) {
				System.out.println(vCenterViewModel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}