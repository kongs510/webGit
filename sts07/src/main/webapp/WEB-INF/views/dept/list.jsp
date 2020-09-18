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
		<h1>부서목록</h1>
	</div>
	<table class="table">
		<thead>
			<tr>
				<th>deptno</th>
				<th>dname</th>
				<th>loc</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list }" var="bean">
				<tr>
					<td><a href="#">${bean.deptno}</a></td>
					<td><a href="#">${bean.dname}</a></td>
					<td><a href="#">${bean.loc}</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<%@ include file="../template/footer.jspf"%>
</body>
</html>
