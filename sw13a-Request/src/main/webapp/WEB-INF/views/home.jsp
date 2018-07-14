<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

<P>  The time on the server is ${serverTime}. </P>

<h2> httpServletRequest </h2>
<p> http://localhost:8181/web/board/confirm_id/?id=abcd&pw=1234 </p>
<p> http://localhost:8181/web/board/check_id/?id=baram&pw=coolwind </p>
<p> http://localhost:8181/web/member/join/?name=바람&id=baram&pw=coolwind&email=wind@wind.com </p>
<p> http://localhost:8181/web/member/joinsimple/?name=바람&id=baram&pw=coolwind&email=wind@wind.com </p>

</body>
</html>
