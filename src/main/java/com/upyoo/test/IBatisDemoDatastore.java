package com.upyoo.test;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.upyoo.util.Rpid;
import com.upyoo.vmware.model.Datastore;
public class IBatisDemoDatastore {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		String config = "sqlMapConfig.xml";
		
		Reader reader = Resources.getResourceAsReader(config);
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		Datastore cViewModel = new Datastore();
		cViewModel.setUuid(Rpid.generate());
		try {
			sqlMap.insert("insertdatastore", cViewModel);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<Datastore> list;
		try {
			list = sqlMap.queryForList("checkdatastore");
			for (Datastore clusterViewModel : list) {
				System.out.println(clusterViewModel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}