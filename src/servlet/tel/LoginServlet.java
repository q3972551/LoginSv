package servlet.tel;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author peanut
 * 地址 
 * path:   /tel
 */

import logic.login.Login;
import net.sf.json.JSONObject;
import com.error.ErrorCode;
import db.teluser.TelUserDataProvider;
import db.teluser.entity.TelUserData;

public class LoginServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String tel = request.getParameter("tel");
		String passwd = request.getParameter("passwd");
		
		String error   = "0";
		String session = null;
		
		if (tel != null && passwd != null)
		{
			TelUserData data = TelUserDataProvider.getInstance().getData(tel);
			if (data == null)
			{
				error = ErrorCode.LOGIN_USERINFO;
			}
			else
			{
				if (passwd.equals(data.getPasswd()))
				{
					session = request.getSession().getId();
					String token = data.getToken();
					Login.saveLoginStatus(session, token);
				}
				else
				{
					error = ErrorCode.LOGIN_PASSWD;
				}
			}
		}
		else
		{
			error = ErrorCode.UNKOWN;
		}
		
		JSONObject ob = new JSONObject();
		if (session != null)
		{
			ob.put("sessionid", session);
		}
		
		ob.put("error", error);
		response.getWriter().write(ob.toString());
	}

}
