package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParamsServlet
 */
@WebServlet(name = "InitParamServlet", urlPatterns = { "/InitParamsServlet" }, initParams = {
		@WebInitParam(name = "dbhost", value = "localhost"), @WebInitParam(name = "dbport", value = "3306") })
public class InitParamsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitParamsServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String location = this.getServletConfig().getInitParameter("dbhost");

		// Context params
		String country = this.getServletContext().getInitParameter("Country");

		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("<p>dbhost : " + location+"</p>");
		pw.append("<p>country: " + country+"</p>");
		pw.append("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
