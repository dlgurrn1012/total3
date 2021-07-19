<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<form action="form_proc.jsp">
name:<input type="text" name="name" value="hong" disabled><br>
<input type="hidden" name="name" value="hong"  disabled>
address:<input type="text" name="address" value="중랑구" disabled><br>
<input type="hidden" name="address" value="중랑구"><br>
<input type="submit" value="전송">
</form>
</body>
</html>