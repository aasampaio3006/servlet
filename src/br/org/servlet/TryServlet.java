package br.org.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//nome da patch
//@WebServlet(urlPatterns = "/try")
public class TryServlet extends HttpServlet{
	
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		PrintWriter out = resp.getWriter();
		out.println("<html>");
        out.println("<body>");
        out.println("Oi mundo, Parabens vc escreveu o primeiro servlets.");
        out.println("</body>");
        out.println("</html>");
		
	}

}
