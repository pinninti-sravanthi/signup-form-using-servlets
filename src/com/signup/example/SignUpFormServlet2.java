package com.signup.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SignUpFormServlet2 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		/*
		 * PrintWriter out = resp.getWriter(); HttpSession session =
		 * req.getSession(false); String n=(String)session.getAttribute("name");
		 * out.print("hello "+n);
		 * 
		 * 
		 * if (session != null) { session.invalidate();
		 */
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String n = req.getParameter("userName");
		out.print("Hello " + n);
	}

}
