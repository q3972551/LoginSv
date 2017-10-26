package logic.login;

import com.redis.RedisTools;

public class Login {
	public static void saveLoginStatus(String session,String token)
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("sessionid_").append(session);
		RedisTools.setKeyAndValue("sessionid_", token);
	}
	
	/**
	 * 
	 * @param user
	 * @return
	 * 
	 * 长度不超过12 ，账号必须得以字母开头，字母加数字加"_"的组合
	 */
	public static boolean isFormatByUser(String user)
	{
		String reg = "^([A-Za-z])[A-Za-z0-9_]{0,12}$";
		boolean ismatch = user.matches(reg);
		return ismatch;
	}
	
	/**
	 * 
	 * @param passwd
	 * @return
	 * 
	 * 长度不超过12，密码必须是数字加字母和下划线的组合
	 */
	public static boolean isFormatByPasswd(String passwd)
	{

		String reg = "[A-Za-z0-9_]{0,12}$";
		boolean ismatch = passwd.matches(reg);
		return ismatch;
	}
}
