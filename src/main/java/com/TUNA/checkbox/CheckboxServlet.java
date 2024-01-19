package com.TUNA.checkbox;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckboxServlet
 */
@WebServlet("/checkResult.do")
public class CheckboxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CheckboxServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String place = request.getParameter("place");
		String[] places = request.getParameterValues("place"); // 배열로 넘어옴
		Map<String, String>nameMap = new HashMap<String, String>();
		nameMap.put("hwaii", "하와이");
		nameMap.put("swiss", "스위스");
		nameMap.put("italy", "이태리");
		nameMap.put("france", "프랑스");
		nameMap.put("usa", "미국");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<h1>선택결과</h1>");
		out.print("선택한 관광지는 ");
		for (int i = 0; i < places.length; i++) {
//			if("hawaii".equalsIgnoreCase(places[i])) {
//				out.print("하와이, ");
//			}else if("swiss".equalsIgnoreCase(places[i])) {
//				out.print("스위스, ");
//			}else if("italy".equalsIgnoreCase(places[i])) {
//				out.print("이태리, ");
//			}else if("france".equalsIgnoreCase(places[i])) {
//				out.print("프랑스, ");
//			}else if("usa".equalsIgnoreCase(places[i])) {
//				out.print("미국, ");
//			}
			// 그리고 여기서 한국어로 변경해줌 (if, map)
//			String nation = this.engToKor(places[i]);
			String nation = nameMap.get(places[i]); // 최종적으로는 Map을 사용해야함
			out.println(nation);
		}
	}
		private String engToKor(String place) {
			String nation ="";
			if("hawaii".equalsIgnoreCase(place)) {
				nation = "하와이, ";
			}else if("swiss".equalsIgnoreCase(place)) {
				nation = "스위스, ";
			}else if("italy".equalsIgnoreCase(place)) {
				nation = "이태리, ";
			}else if("france".equalsIgnoreCase(place)) {
				nation = "프랑스, ";
			}else if("usa".equalsIgnoreCase(place)) {
				nation = "미국, ";
			}
			return nation;
		}
	}
	

