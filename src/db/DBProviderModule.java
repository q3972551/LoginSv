package db;

import java.io.InputStream;

import common.module.IModule;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class DBProviderModule implements IModule{
	
	private static DBProviderModule instance = null;
	private SqlMapClient roleSqlMapClient    = null;
	
	private DBProviderModule()
	{
		
	}
	
	public static DBProviderModule getInstance(){
		if (instance == null)
		{
			instance = new DBProviderModule();
		}
		return instance;
	}
	
	private void initRoleSQLMapClient() throws Exception {
		if (roleSqlMapClient == null)
		{
			roleSqlMapClient = getSqlMapClient("/dbconfig/user_sqlmapconfig.xml");
		}
	}

	
	private SqlMapClient getSqlMapClient(String ibatisconfig) {
		InputStream heishidbMapConfigFile = DBProviderModule.class.getResourceAsStream(ibatisconfig);
		if (heishidbMapConfigFile == null)
			throw new RuntimeException("cannot found the resource file of " + ibatisconfig);
		SqlMapClient sqlMapperclient = SqlMapClientBuilder.buildSqlMapClient(heishidbMapConfigFile);
		return sqlMapperclient;
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		try {
			initRoleSQLMapClient();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public SqlMapClient getRoleSqlMapClient() {
		return roleSqlMapClient;
	}
}
