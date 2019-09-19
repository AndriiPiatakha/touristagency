package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UserDao;
import dao.impl.DefaultUserDao;
import models.UserData;


public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		UserDao userDao = DefaultUserDao.getUserDaoInstance();
		UserData userData = new UserData();
		String name = request.getParameter("name");
		userData.setName(name);
		userDao.saveUser(userData);	
	}

}
