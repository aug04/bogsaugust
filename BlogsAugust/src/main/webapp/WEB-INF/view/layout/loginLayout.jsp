<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
	    <meta name="description" content="">
	    <meta name="author" content="">
	    <title>Login to manage blog</title>
	    <link rel="icon" href="${pageContext.request.contextPath }/resources/images/icon.png">
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap/bootstrap.min.css">
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap/login.css">
	</head>
	<body>
		<tiles:insertAttribute name="html"/>
	</body>
</html>