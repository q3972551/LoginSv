package db.qquser;

import java.sql.SQLException;

import common.module.IModule;
import db.DBProviderModule;
import db.qquser.dao.QQUserDataDAO;
import db.qquser.dao.QQUserDataDAOImpl;
import db.qquser.entity.QQUserData;
public class QQUserDataProvider implements IModule{

	private QQUserDataDAO m_dao = new QQUserDataDAOImpl(DBProviderModule.getInstance().getRoleSqlMapClient());
	private static QQUserDataProvider s_instance = null;
	private QQUserDataProvider()
	{
		
	}
	
	public static QQUserDataProvider getInstance()
	{
		if (s_instance == null)
		{
			s_instance = new QQUserDataProvider();
		}
		
		return s_instance;
	}
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}
	
	public QQUserData getData(String id)
	{
		QQUserData data = null;
		try {
			data = m_dao.selectByPrimaryKey(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return data;
	}
	
	public boolean updateData(QQUserData data)
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
	
	public boolean insertData(QQUserData data)
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
