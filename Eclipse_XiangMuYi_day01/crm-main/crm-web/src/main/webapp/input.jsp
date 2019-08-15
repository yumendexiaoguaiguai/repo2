<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>客户添加</title>
</head>
<body>
<form action="customer/save.action" method="post">
	客户姓名：<input type="text" name="custName"/><br/>
	客户性别：<input type="text" name="custGender"/><br/>
	客户级别：<input type="text" name="custLevel"/><br/>
	<input type="submit" value="保存"/>
	
</form>
</body>
</html>