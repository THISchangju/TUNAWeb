package com.TUNA.calculator;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalculatorServlet
 */
@WebServlet("/calcResult.do") // form태그에 오타없이 그대로 적을것.
public class CalculatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
    public CalculatorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 쿼리스트링 : ?first-num=12&operator=+&second-num=21
		String firstNum = request.getParameter("first-num"); // 반대편에(InputData) 오타없이 그대로 적을것.
		String operator = request.getParameter("operator"); // 시험
		String secondNum = request.getParameter("second-num"); // 넘어올 때 문자열로 오기 때문에 String적어줌
												// 웹으로 출력
		int num1 = Integer.parseInt(firstNum);
		int num2 = Integer.parseInt(secondNum);
		int result = 0;
		switch(operator) {
		case "+" : result = num1 + num2; break;
		case "-" : result = num1 - num2; break;
		case "X" : result = num1 * num2; break; // inputData에서 X라고 입력했기 때문에
												// case " "안에 *이 아닌 X라고 입력
		case "/" : result = num1 / num2; break;
		case "%" : result = num1 % num2; break;
		}
//		out.println("firstNum : " + firstNum);
//		out.println("operator : " + operator);
//		out.println("secondNum : " + secondNum);
		response.setContentType("text/html; charset=utf-8"); // 응답시 한글 깨짐 방지
															 // (이걸 먼저 쓰고 PrintWriter를 써줘야 한글이 안깨짐
															 // 꼭!
		PrintWriter out = response.getWriter(); // 콘솔 출력말고 서버에 올려서
		out.println("<html><head><title>입력값에 대한 계산결과</title></head>");
		out.println("<body><h1>계산결과</h1>");
		out.println("<h1>"+firstNum + " " + operator + " " + secondNum + "=" + result+"</h1>"); 
					// html에서 사용되는 태그 사용 가능
		out.println("</body>");
		out.println("</html>");
		
	}

}
