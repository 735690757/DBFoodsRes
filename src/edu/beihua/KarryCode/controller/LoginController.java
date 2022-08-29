package edu.beihua.KarryCode.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.beihua.KarryCode.model.UserModel;

public class LoginController extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("helloworld!");
		String uusername = request.getParameter("username");
		String ppassword = request.getParameter("password");
		boolean res = true;
		UserModel Um = new UserModel();
		res = Um.login(uusername, ppassword);
		if(res){
			request.getRequestDispatcher("loginsuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("loginfail.html").forward(request, response);
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
