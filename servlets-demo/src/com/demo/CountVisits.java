package com.demo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CountVisits
 */
@WebServlet("/CountVisits")
public class CountVisits extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		HttpSession session = request.getSession(true);
		Integer count = (Integer) session.getAttribute("counts");
		if(count == null)
			count = new Integer(1);
		else
			count++;
		session.setAttribute("counts", count);
		out.println("You visited here " + count + " times!");
		
		out.println(session.getId() + "<br>");
		out.println(new Date(session.getLastAccessedTime()) + "<br>");
		out.println(new Date(session.getCreationTime()));
	}
}
