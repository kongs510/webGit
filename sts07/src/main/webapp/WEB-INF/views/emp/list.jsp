<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" pageEncoding="utf-8"%>
<html>
<head>
<meta charset="utf-8">
<title>Home</title>
<%@ include file="../template/head.jspf"%>
</head>
<body>
	<%@ include file="../template/header.jspf"%>
	<div class="page-header">
		<h1>EMP 페이지</h1>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>sabun</th>
				<th>name</th>
				<th>nalja</th>
				<th>pay</th>
				<th>dname</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td><a href="#">${bean.sabun}</a></td>
					<td><a href="#">${bean.name}</a></td>
					<td><a href="#">${bean.nalja}</a></td>
					<td><a href="#">${bean.pay}</a></td>
					<td><a href="#">${bean.dname}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<p><a href="add" class="btn btn-primary btn-block" rel="btn">입력</a></p>
	<%@ include file="../template/footer.jspf"%>
</body>
</html>
