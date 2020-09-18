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
		<h1>상세페이지</h1>
	</div>
<form class="form-horizontal" method="post" action="./">
  <div class="form-group">
    <label for="deptno" class="col-sm-2 control-label">deptno</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="deptno" id="deptno" value="${bean.deptno }" readonly="readonly">
    </div>
  </div>
  <div class="form-group">
    <label for="dname" class="col-sm-2 control-label">dname</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="dname" id="dname" value="${bean.dname }"readonly="readonly">
    </div>
  </div>
  <div class="form-group">
    <label for="loc" class="col-sm-2 control-label">loc</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="loc"   id="loc" value="${bean.loc }" readonly="readonly">
    </div>
  </div>
  
</form>
<a href="./${bean.deptno }/edit" class="btn btn-default" role="btn">수정</a>
<form method="post">
<input type="hidden" name="_method" value="delete">
<button>삭제</button>
</form>
	<%@ include file="../template/footer.jspf"%>
</body>
</html>
