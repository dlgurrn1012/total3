<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
name:${param.name }<br>
address:${param.address }<br>
<form action="">
name:<input type="text" name="name" value=${param.name} disabled><br>
</form>
</body>
</html>