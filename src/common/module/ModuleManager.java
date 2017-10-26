package common.module;

import db.DBProviderModule;
import db.qquser.QQUserDataProvider;
import db.teluser.TelUserDataProvider;
import db.user.UserDataProvider;
import db.weibouser.WeiBoUserDataProvider;
import db.wxuser.WXUserDataProvider;


public class ModuleManager extends IModuleManager{
	private static ModuleManager instance;

	private ModuleManager() {

	}

	public static ModuleManager getInstance() {
		if (instance == null) {
			instance = new ModuleManager();
		}
		return instance;
	}

	public void init() {
		this.initDataBase();
		this.registerModules();
		super.init();
		this.registDBModule();
		
	}
	
	private void initDataBase()
	{
	}
	
	private void registerModules()
	{
		this.registerModule(DBProviderModule.getInstance());
	}
	
	private void registDBModule()
	{
		UserDataProvider.getInstance().init();
		WXUserDataProvider.getInstance().init();
		QQUserDataProvider.getInstance().init();
		TelUserDataProvider.getInstance().init();
		WeiBoUserDataProvider.getInstance().init();
	}
}
