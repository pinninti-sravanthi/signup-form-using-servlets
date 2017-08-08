package com.signup.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class SignUpFormServlet1 extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		try {
			resp.setContentType("text/html");

			PrintWriter out = resp.getWriter();
			// String name = req.getParameter("userName");
			String email = req.getParameter("email");
			String userPass = req.getParameter("userPass");
			String phonenumber = req.getParameter("phonenumber");
			// out.println("welcome " + name);
			String regex = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
					+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

			String regex2 = "^.*(?=.{8,})(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])[a-zA-Z0-9@#$%^&+=]*$";
			String regex3 = "^(0|91)?[7-9][0-9]{9}$";
			Pattern pattern = Pattern.compile(regex);
			Pattern pattern2 = Pattern.compile(regex2);
			Pattern pattern3 = Pattern.compile(regex3);

			Matcher matcher = pattern.matcher(email);
			Matcher matcher2 = pattern2.matcher(userPass);
			Matcher matcher3 = pattern3.matcher(phonenumber);

			if (!email.isEmpty() && email.length() > 0) {

				if (matcher.matches()) {

				} else {
					out.println("invalid email");
				}

				if (!userPass.isEmpty()) {

					if (matcher2.matches()) {

					} else {
						out.println("password is invalid");
					}

					if (!phonenumber.isEmpty()) {

						if (matcher3.matches()) {

						} else {
							out.println("phonenumber is invalid");
						}
					} else {
						out.println("invalid");

					}
				}
			}
			// HttpSession session = req.getSession();
			// session.setAttribute("name", name);
			// out.print("<a href='servlet2'>visit</a>");

			if (matcher.matches() && matcher2.matches() && matcher3.matches()) {
				req.getRequestDispatcher("/SignUpFormServlet2").forward(req, resp);

			}

		} catch (

		Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
