package servletPro;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/first")
public class firstClass implements Servlet{
	
	private ServletConfig servletConfig;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("1st Destroying Servlet");
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		servletConfig = config;
		System.out.println("1st Servlet is Initializing");
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("1st Service Request");
	}
	
//	NON cycle method
	
	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This servlet is Created by author: 1st ";
	}

}
