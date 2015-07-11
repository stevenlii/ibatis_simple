package com.upyoo.test;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.upyoo.util.Rpid;
import com.upyoo.vmware.viewandmodel.ClusterViewModel;
import com.upyoo.vmware.viewandmodel.VCenterViewModel;
public class IBatisDemoClusterView {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		String config = "sqlMapConfig.xml";
		
		Reader reader = Resources.getResourceAsReader(config);
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		ClusterViewModel cViewModel = new ClusterViewModel();
		cViewModel.setId(Rpid.generate());
		try {
			sqlMap.insert("insertClusterViewModel", cViewModel);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<ClusterViewModel> list;
		try {
			list = sqlMap.queryForList("checkFromCluster");
			for (ClusterViewModel clusterViewModel : list) {
				System.out.println(clusterViewModel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}