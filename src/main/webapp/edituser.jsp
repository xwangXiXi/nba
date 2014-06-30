<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>新增用戶</title>
</head>
<body>
	<form action="user/addUser" method="post">
		<table>
			<tr>
				<td>球员名称：</td>
				<td><input type="text" name="userName" value="" /></td>
			</tr>
			<tr>
				<td>球员密码：</td>
				<td><input type="text" name="userPassword" value="0000" /></td>
			</tr>
			<tr>
				<td>所属角色：</td>
				<td><input type="text" name="rid" value="1" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="注  册" /></td>
			</tr>
		</table>
	</form>

</body>
</html>