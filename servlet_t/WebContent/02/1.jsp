<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<% ArrayList list=(ArrayList)request.getAttribute("a");
ArrayList list1=(ArrayList)request.getAttribute("b");
%>
<div style="background-color":black>
<table border="1"align="center" bordercolor="#66ccff">
<tr><td>姓名</td><td>爱好</td></tr>
<%for(int i=0;i<list.size();i++){
	String str=(list.get(i)).toString();
	String str1=list1.get(i).toString();
%>	

<tr><td><%=str%></td><td><%=str1 %></tr>
<% 
}
%>


</table>
</div>



</body>
</html>