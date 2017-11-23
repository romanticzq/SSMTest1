<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	index<br>
	<c:forEach items="${pageinfo.list }" var="temp">
		${temp.studentno }&nbsp;&nbsp;${temp.studentname }
		<a href="do_delete?studentno=${temp.studentno }">删除</a>&nbsp;&nbsp;
		<a href="to_update?studentno=${temp.studentno }">修改</a>&nbsp;&nbsp;
		<a href="to_select?studentno=${temp.studentno }">详情</a><br>
	</c:forEach>
	<a href="list?pageNum=1">首页</a>
	<a href="list?pageNum=${pageinfo.prePage }">上一页</a>
	<c:forEach items="${pageinfo.navigatepageNums }" var="page">
		<a href="list?pageNum=${page }">${page }</a>
	</c:forEach>
	<a href="list?pageNum=${pageinfo.nextPage }">下一页</a>
	<a href="list?pageNum=${pageinfo.pages}">末页</a><br>
	<a href="to_add">添加</a>
</body>
</html>