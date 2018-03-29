<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spittle</title>
<link type="text/css" rel="stylesheet" href="resources/style.css"/>
</head>
<body>
 <div class="listTitle">
      <h1>Recent Spittles</h1>
      <ul class="spittleList">
	<c:forEach items="${spittleList }" var="spittle">
		<li id="spittle_<c:out value="spittle.id"/>">
			<div class="spittleMessage">
				<c:out value="${spittle.message}"/>
			</div>
			<div>
				<span class="spittleTime"><c:out value="${spittle.time }"/></span>
				<span class="spittleLocation">(<c:out value="${spittle.latitude }"/>, <c:out value="${spittle.longitude }"/>)</span>
			</div>
		</li>
	</c:forEach>
	</ul>
	</div>
</body>
</html>