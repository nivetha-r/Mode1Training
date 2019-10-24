package com.hcl.cookie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddCookieServlet
 */
public class AddCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCookieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	  PrintWriter out=response.getWriter();
	  
	  Cookie ckNivetha=new Cookie("Nivetha", "52");
	  ckNivetha.setMaxAge(1000*24*60*60);
	  response.addCookie(ckNivetha);
	  
	  Cookie ckNisha=new Cookie("Nisha", "78");
	  ckNisha.setMaxAge(1000*24*60*60);
	  response.addCookie(ckNisha);
	  
	  Cookie ckCharu=new Cookie("Charu", "35");
	  ckCharu.setMaxAge(1000*24*60*60);
	  response.addCookie(ckCharu);
	  
	  Cookie ckKamila=new Cookie("Kamila", "36");
	  ckKamila.setMaxAge(1000*24*60*60);
	  response.addCookie(ckKamila);
	  
	  out.println("cookie created successfully <br/><br/>");
	  out.println("<a href='ShowCookieServlet'>Show Cookie</a>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
