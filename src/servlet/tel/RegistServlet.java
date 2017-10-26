/**
 * @author peanut
 * 地址 
 * path:   /tel/reg
 */

package servlet.tel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import net.sf.json.JSONObject;
import logic.login.Login;
import com.error.ErrorCode;
import com.sms.SMSTools;
import db.teluser.TelUserDataProvider;
import db.teluser.entity.TelUserData;

public class RegistServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tel = request.getParameter("tel");
		String passwd = request.getParameter("passwd");
		String code   = request.getParameter("code");
		String error = "0";
		
		JSONObject ob = new JSONObject();
		
		if (SMSTools.isCheckCode(tel, code))
		{
			error = ErrorCode.SMS_Code;
		}
		else
		{
			if (tel != null && passwd != null)
			{
				boolean isFormat_Passwd = Login.isFormatByPasswd(passwd);
				if (isFormat_Passwd)
				{
					this.register(tel, passwd);
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
		}
		
		ob.put("error", error);
		response.getWriter().write(ob.toString());
		
	}
	
	private boolean register(String user,String passwd)
	{
		TelUserData data = TelUserDataProvider.getInstance().getData(user);
		if (data != null)
		{
			return false;
		}
		
		long time = System.currentTimeMillis();
		data = new TelUserData();
		data.setTel(user);
		data.setPasswd(passwd);
		data.setRegtime(time);
		data.setLogintime(time);
		
		TelUserDataProvider.getInstance().insertData(data);
		
		return true;
	}

}
