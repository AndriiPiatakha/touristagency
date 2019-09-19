package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.impl.DefaultUserDao;
import models.UserData;


public class HelloWorldServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DefaultUserDao userDao;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws IOException {
		Integer id = Integer.valueOf(request.getParameter("id"));
		userDao = DefaultUserDao.getUserDaoInstance();
		UserData userById = userDao.getUserById(id);
		response.getWriter().println(userById);
	}

}
