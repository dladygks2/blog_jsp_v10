package com.cos.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿이란 Dynamic Web Page(동적 웹 페이지)를 만들 때 사용되는 자바 기반의 웹 애플리케이션(Web Application Service , WAS)
// 클라이언트(웹 브라우저)에서 요청(request), 응답(response) --> GET(주소를 직접 입력해서 응답받는 것), POST 의 방식이 있다.
@WebServlet("/test")    // "/test" 얘가 주소가 된다.
public class ApiTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public ApiTest() {
        super();
       
    }

    @Override
    public void init() throws ServletException {
    	super.init();   // 초기화
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	super.service(req, resp);
    }
    
    @Override
    public void destroy() {
    	super.destroy();
    }
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		String mime = request.getContentType();
		System.out.println(mime);
//		mime 의 type : 
		String food = request.getParameter("food");
		System.out.println(food);
		
//		DB에 접속해서 결과를 찾아서 리턴하는 것 : get의 방식
//		객체
		
//		response.setContentType("text/plain;charset=utf-8");
//		response.setContentType("aplication/json/text/plain;charset=utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>"+ food + "</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
		
		
		
		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String food = request.getParameter("food");
		String receipe = request.getParameter("receipe");
		
		System.out.println(food);
		System.out.println(receipe);
		
//		
		// DB에 인설트 하고 끝
		int result = 1; // -1
		
		if (result == 1) {
//			성공응답
		}else {
//			실패응답
		}
		
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter(); 
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>포스트 방식입니다.</h1>");
		out.println("</body>");
		out.println("</html>");
		out.flush();
	}

}
