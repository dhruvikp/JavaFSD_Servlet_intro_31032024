package com.simplilearn.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetHandlerServlet
 */
@WebServlet("/getInfo")
public class GetHandlerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public GetHandlerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		PrintWriter writer = response.getWriter();

		writer.append("<html><body>");
		writer.append("<h1>Welcome to Simplilearn! </h1>");
		writer.append("<p> Happy Learning! ");
		writer.append("<p>Hey " + name + "</p>");
		writer.append("</body></html>");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("name");

		PrintWriter pw = response.getWriter();
		pw.append("<html><body>");
		pw.append("<p> Hello "+name+"</p>");
		pw.append("<p> This is POST request </p>");
		pw.append("</body></html>");

	}

}
