package servlet.passwd;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import com.error.ErrorCode;
import com.sms.SMSTools;

import db.teluser.TelUserDataProvider;
import db.teluser.entity.TelUserData;

public class ForgotPasswdServlet_Tel extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String tel    = request.getParameter("tel");
		String code   = request.getParameter("code");
		String passwd = request.getParameter("passwd");
		String error  = "0";
		
		JSONObject ob = new JSONObject();
		boolean isCode = SMSTools.isCheckCode(tel, code);
		if (isCode)
		{
			TelUserData data = TelUserDataProvider.getInstance().getData(tel);
			if (data == null)
			{
				error = ErrorCode.LOGIN_USERINFO;
			}
			else
			{
				data.setPasswd(passwd);
				TelUserDataProvider.getInstance().updateData(data);
			}
		}
		else
		{
			error = ErrorCode.SMS_Code;
		}
		ob.put("error", error);

		response.getWriter().write(ob.toString());
	}
}
