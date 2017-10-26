package servlet.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;
import logic.login.Login;

import com.error.ErrorCode;

import db.user.UserDataProvider;
import db.user.entity.UserData;

public class RegistServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String passwd = request.getParameter("passwd");
		String error = "0";
		
		JSONObject ob = new JSONObject();
		if (user != null && passwd != null)
		{
			boolean isFormat_User   = Login.isFormatByUser(user);
			boolean isFormat_Passwd = Login.isFormatByPasswd(passwd);
			if (isFormat_User && isFormat_Passwd)
			{
				this.register(user, passwd);
				String session = request.getSession().getId();
				ob.put("sessionid", session);
			}
			else
			{
				error = ErrorCode.Register_Format;
			}
		}
		else
		{
			error = ErrorCode.UNKOWN;
		}
		
		
		ob.put("error", error);
		response.getWriter().write(ob.toString());
		
	}
	
	private boolean register(String user,String passwd)
	{
		UserData data = UserDataProvider.getInstance().getData(user);
		if (data != null)
		{
			return false;
		}
		
		long time = System.currentTimeMillis();
		data = new UserData();
		data.setUser(user);
		data.setPasswd(passwd);
		data.setRegtime(time);
		data.setLogintime(time);
		
		UserDataProvider.getInstance().insertData(data);
		
		return true;
	}

}
