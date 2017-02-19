package com.bo.javawebmvc;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListStudentsServlet
 */
public class ListStudentsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListStudentsServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		request.setAttribute("students", Arrays.asList("aa","bb","cc"));
//		request.getRequestDispatcher("/students.jsp").forward(request, response);
		StudentDao studentDao = new StudentDao();
		List<Student> students = studentDao.getAll();
		request.setAttribute("students",students);
		request.getRequestDispatcher("/students.jsp").forward(request, response);
		

	}

}
