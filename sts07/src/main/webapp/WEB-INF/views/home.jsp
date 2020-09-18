<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" pageEncoding="utf-8" %>
<html>
<head>
	<meta charset="utf-8">
	<title>Home</title>
	<%@ include file="template/head.jspf" %>
</head>
<body>
<div class="jumbotron">
	<%@ include file="template/header.jspf" %>
<h1>
	환영하므니다  
</h1>

<P>  현재시간은  ${serverTime}. </P>
</div>
	<%@ include file="template/footer.jspf" %>
</body>
</html>
