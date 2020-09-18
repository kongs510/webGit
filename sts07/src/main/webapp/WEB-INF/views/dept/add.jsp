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
		<h1>입력페이지</h1>
	</div>
<form class="form-horizontal" method="post" action="./">
  <div class="form-group">
    <label for="dname" class="col-sm-2 control-label">dname</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="dname" id="dname" placeholder="dname">
    </div>
  </div>
  <div class="form-group">
    <label for="loc" class="col-sm-2 control-label">loc</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" name="loc"   id="loc" placeholder="loc">
    </div>
  </div>
     <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default">입력</button>
    </div>
  </div>
  
</form>
	<%@ include file="../template/footer.jspf"%>
</body>
</html>
