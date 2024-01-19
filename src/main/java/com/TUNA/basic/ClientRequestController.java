package com.TUNA.basic;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ClientRequestController
 */
@WebServlet("/show/me.something")
public class ClientRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientRequestController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
//	public void init(ServletConfig config) throws ServletException {
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트 요청에 따른 응답을 하도록 프로그래밍 하였음
		// 서블릿 컨테이너에서 서블릿 객체를 사용하여 프로그래밍 함
		// 서블릿 컨테이너는 탐캣임. 탐캣이 연결되어야 서블릿 컨테이너를 사용할수있고
		// 서블릿 컨테이너를 사용할수이썽야 서버프로그래밍도 할수 있음.
		
		PrintWriter out = response.getWriter();
		out.println("This is an answer");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		doGet(request, response);
//	}

	/**
	 * @see Servlet#destroy()
	 */
//	public void destroy() {
//		// TODO Auto-generated method stub
//	}

}