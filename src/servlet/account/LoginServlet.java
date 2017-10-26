/**
 * @author peanut
 * 
 * 登陆 上行消息 : "user"  :"abc"
 *           "passwd":"123"
 *           
 *    下行消息 ：
 *          "error"  :"0"
 *          "sessionid":"zxcasasczxc"
 *          
 *          
 */

package servlet.account;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.login.Login;
import net.sf.json.JSONObject;
import com.error.ErrorCode;
import db.user.UserDataProvider;
import db.user.entity.UserData;

public class LoginServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		String passwd = request.getParameter("passwd");
		
		String error   = "0";
		String session = null;
		if (user != null && passwd != null)
		{
			UserData data = UserDataProvider.getInstance().getData(user);
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
