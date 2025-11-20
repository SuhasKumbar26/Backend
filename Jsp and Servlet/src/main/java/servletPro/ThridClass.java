package servletPro;

import java.awt.print.Printable;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/third")
public class ThridClass extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Processing 3rd servlet");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String string = req.getParameter("message");
		
		System.out.println("Form submited on 3rd /third API and Your MSG is: "+string);
		
		//Sending Response
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		writer.printf("""
				<h2>Your from submited with Message: %s </h2>
				""",string);
		
		resp.setStatus(504);
	}
	
	
	
}
