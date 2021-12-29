<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body align=right>
<jsp:include page="10_header.jsp" />
<!-- <a href="login.jsp">로그인</a> -->
<%
	if(request.getAttribute("id")==null){
	String userid=(String) session.getAttribute("id");
	if(userid==null){
		out.print("<a href='login.jsp'>로그인</a>&nbsp;"+"<a href='register.jsp'>회원가입</a>");
	} else {
		out.print(userid+"<a href=logout.jsp>로그아웃</a>");
	}
	}
// 	Cookie[] cookies=request.getCookies();
// 	boolean flag=true;
// 	for(Cookie c:cookies){
// 		if(c.getName().equals("id")){
// 			out.println(c.getValue()+"&nbsp;&nbsp;<a href='logout.jsp'>로그아웃</a>");
// 			flag=true;
// 			break;
// 		}
// 	}
// 	if(flag==true){
// 		out.println("<a href='login.jsp'>로그인</a>&nbsp;&nbsp;<a href='register.jsp'>회원가입</a>");
// 	}
%>
<jsp:include page="10_footer.jsp" />
</body>
</html>