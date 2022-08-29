package edu.beihua.KarryCode.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.beihua.KarryCode.model.UserModel;

public class RegController extends HttpServlet {

	public RegController() {
		super();
	}
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userName = request.getParameter("username");
		String userPass = request.getParameter("password");
		String userPass2 = request.getParameter("password2");
		String userEmil = request.getParameter("useremail");
		
		UserModel um = new UserModel();
		boolean result = um.reg(userName, userPass,userEmil);
		if(result){
			request.getRequestDispatcher("reSuccess.jsp").forward(request, response);
		}else{
			request.getRequestDispatcher("reFail.jsp").forward(request, response);
		}
	}
}
