package db.weibouser;

import java.sql.SQLException;

import common.module.IModule;
import db.DBProviderModule;
import db.weibouser.dao.WeiBoUserDataDAO;
import db.weibouser.dao.WeiBoUserDataDAOImpl;
import db.weibouser.entity.WeiBoUserData;

public class WeiBoUserDataProvider implements IModule{

	private WeiBoUserDataDAO m_dao = new WeiBoUserDataDAOImpl(DBProviderModule.getInstance().getRoleSqlMapClient());
	private static WeiBoUserDataProvider s_instance = null;
	private WeiBoUserDataProvider()
	{
		
	}
	
	public static WeiBoUserDataProvider getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new WeiBoUserDataProvider();
		}
		
		return s_instance;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	public WeiBoUserData getData(String id)
	{
		WeiBoUserData data = null;
		try {
			data = m_dao.selectByPrimaryKey(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean updateData(WeiBoUserData data)
	{
		boolean isOK = true;
		try {
			this.m_dao.updateByPrimaryKeySelective(data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isOK = false;
		}
		
		return isOK;
	}
	
	public boolean insertData(WeiBoUserData data)
	{
		boolean isOK = true;
		try {
			this.m_dao.insert(data);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			isOK = false;
		}
		
		return isOK;
	}

}
