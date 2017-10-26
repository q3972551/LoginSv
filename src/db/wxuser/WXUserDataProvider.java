package db.wxuser;

import java.sql.SQLException;

import common.module.IModule;
import db.DBProviderModule;
import db.wxuser.dao.WXUserDataDAO;
import db.wxuser.dao.WXUserDataDAOImpl;
import db.wxuser.entity.WXUserData;

public class WXUserDataProvider implements IModule{

	private WXUserDataDAO m_dao = new WXUserDataDAOImpl(DBProviderModule.getInstance().getRoleSqlMapClient());
	private static WXUserDataProvider s_instance = null;
	private WXUserDataProvider()
	{
		
	}
	
	public static WXUserDataProvider getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new WXUserDataProvider();
		}
		
		return s_instance;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	public WXUserData getData(String id)
	{
		WXUserData data = null;
		try {
			data = m_dao.selectByPrimaryKey(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean updateData(WXUserData data)
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
	
	public boolean insertData(WXUserData data)
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
