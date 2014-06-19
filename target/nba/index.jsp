<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NBA球员管理系统</title>
</head>
<body>
<c:if test="${! empty error}">
	<font><c:out value="${error }"></c:out></font>
</c:if>
<form action="<c:url value="/loginCheck.do" />" method="post"> 
	用户名：<input type="text" value=""  name="userName"/><br><br>
	密码：<input type="password" value="" name="userPassword" /><br><br>
	<input type="submit"   id="loginBtn" value="登   录" >
	<input type="reset"   id="resBtn" value="重  置" >
</form>
</body>
</html>