package com.TUNA.radio;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RadioBtnServlet
 */
@WebServlet("/radioResult.do")
public class RadioBtnServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RadioBtnServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender = request.getParameter("gender");
		String checkValue = request.getParameter("check-mail");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>라디오 체크 결과</title>");
		out.println("</head><body>");
		out.println("<h1>라디오 체크 결과</h1>");
		out.println("성별 : " + gender + "<br>");
		out.println("메일 수신여부 : " + checkValue + "<br>");
		out.println("</body></html>");
	}

}
