<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
public class Imsi{
	String name;
	String address;
	
	public getName(){
		return name;
	}
	public getAddress(){
		return address;
	}
	public setName(String name){
		this.name=name;
	}
	public setAddress(String address){
		this.address=address;
	}
}
%>
<%
Imsi imsi=new Imsi();
imsi.setName("hong");
imsi.setAddress("�߶���");
request.setAttribute(imsi, imsi);
request.getRequestDispatcher("form3_proc.jsp").forward(request,response);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
name:<input type="text" id="name" name="name" value="hong" disabled><br>
address:<input type="text" name="address" value="�߶���" disabled><br>
<input type="button" value="����" onclick="location.href='/board/update'">
<script>
//alert(document.getElementById("name").value);
function send(){
	var name=document.getElementById("name").value;
	var address=document.getElementById("address").value;
	location.href="form_proc.jsp?name=";+name+"&address="+address;
}
</script>
</body>
</html>