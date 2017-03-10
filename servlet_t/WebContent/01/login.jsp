<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="<%=request.getContextPath() %>/checkservlet" method="post">
<table border="1" cellspacing="0" cellpadding="5" align="center">
<tr>
<td colspan="2" align="center">用户登录</td>
</tr>
<tr>
<td >请输入账号:</td>
<td><input type="text" name="uname"/></td>
</tr>
<tr>
<td >请输入密码:</td>
<td><input type="password" name="upwd"/></td>
</tr>
<tr>
<td colspan="2" align="center">
<input type="submit" name="提交"/>
<input type="reset" name="重置"/>
</td>
</tr>


</table>



</form>
</body>
</html>