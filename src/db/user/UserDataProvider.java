package db.user;

import java.sql.SQLException;

import common.module.IModule;
import db.DBProviderModule;
import db.user.dao.UserDataDAO;
import db.user.dao.UserDataDAOImpl;
import db.user.entity.UserData;

public class UserDataProvider implements IModule{

	private UserDataDAO m_dao = new UserDataDAOImpl(DBProviderModule.getInstance().getRoleSqlMapClient());
	private static UserDataProvider s_instance = null;
	private UserDataProvider()
	{
		
	}
	
	public static UserDataProvider getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new UserDataProvider();
		}
		
		return s_instance;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	public UserData getData(String id)
	{
		UserData data = null;
		try {
			data = m_dao.selectByPrimaryKey(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean updateData(UserData data)
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
	
	public boolean insertData(UserData data)
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
