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
<div class="spittleView">
	<div class="spittleMessage"><c:out value="${spittle.message }"/></div>
	<div class="spittleTime"><c:out value="${spittle.time }"/></div>
</div>
</body>
</html>