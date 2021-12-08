<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	안녕하세요<br>
	index.jsp임
	<br>
	jsp는 html에 java코드가 섞여있는 놈이다.
	<br>
	jsp는 완전히 html로 바꿔서 브라우저로 보이게 하는듯
	<br><br><br>
	웹서버가 이해할수 없는애는 톰캣이나 아파치(서블리 뭐시기...)를 설치한것
	<br><br><br>
	.jsp를 톰캣에게 넘긴다.
	
	1. 서블릿 파일로 변환
		index-jsp.java --- 로 변환을 먼저 한다.
		java파일이므로 컴파일이 가능. 
		
	2. 컴파일하면
		index-jsp.class --- 로 변환
		이러면 컴퍼가 읽을 수 있따.
		
	3. 컴터가 
		index.html ------ 로 변환해준다.
		
------------------------
http: ip주소 : port number : test.html ---> url(uniform resource locator) 이라고 한다 이런 형식을



쿼리 스트링 방식 : ??? 

-----------------------
http 통신( protocol, 약속)

-> header, body

브라우저에서 콜을 하고 서버의 주소체계를 통해 전달을 받을 것

예) a.avi 파일 요청하면, 시리얼 라이저블?(직렬화)를 하여 이진수로 보내게 되면

해석해야한다.

























	
</body>
</html>