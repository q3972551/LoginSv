package db.teluser;

import java.sql.SQLException;

import common.module.IModule;
import db.DBProviderModule;
import db.teluser.dao.TelUserDataDAO;
import db.teluser.dao.TelUserDataDAOImpl;
import db.teluser.entity.TelUserData;
public class TelUserDataProvider implements IModule{

	private TelUserDataDAO m_dao = new TelUserDataDAOImpl(DBProviderModule.getInstance().getRoleSqlMapClient());
	private static TelUserDataProvider s_instance = null;
	private TelUserDataProvider()
	{
		
	}
	
	public static TelUserDataProvider getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new TelUserDataProvider();
		}
		
		return s_instance;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	public TelUserData getData(String id)
	{
		TelUserData data = null;
		try {
			data = m_dao.selectByPrimaryKey(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean updateData(TelUserData data)
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
	
	public boolean insertData(TelUserData data)
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
