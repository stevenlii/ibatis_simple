package com.upyoo.test;
import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;
import com.upyoo.util.Rpid;
import com.upyoo.vmware.model.Disk;
import com.upyoo.vmware.model.ESXServer;
import com.upyoo.vmware.viewandmodel.ClusterViewModel;
import com.upyoo.vmware.viewandmodel.VCenterViewModel;
public class IBatisDemoDisk {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		
		String config = "sqlMapConfig.xml";
		
		Reader reader = Resources.getResourceAsReader(config);
		SqlMapClient sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
		Disk cViewModel = new Disk();
		cViewModel.setUuid(Rpid.generate());
		try {
			sqlMap.insert("insertdisk", cViewModel);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		List<Disk> list;
		try {
			list = sqlMap.queryForList("checkdisk");
			for (Disk clusterViewModel : list) {
				System.out.println(clusterViewModel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}