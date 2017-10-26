package servlet;

import javax.servlet.http.HttpServlet;

import common.module.ModuleManager;

public class StartUpServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void init()
	{
		ModuleManager.getInstance().init();
		System.out.println("Start up!");
	}
}
