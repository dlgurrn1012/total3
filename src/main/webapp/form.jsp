<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
name:<input type="text" id="name" name="name" value="hong" disabled><br>
<input type="hidden" id="name" name="name" value="hong" disabled><br>
address:<input type="text" name="address" value="�߶���" disabled><br>
<input type="hidden" name="address" value="�߶���" disabled><br>
<input type="button" value="����" onclick="location.href='/board/update'">
</body>
</html>