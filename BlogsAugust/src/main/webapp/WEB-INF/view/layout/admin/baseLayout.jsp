<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>${model.title }</title>
		<link rel="icon" href="${pageContext.request.contextPath }/resources/images/icon.png">
		
		 <!-- Bootstrap Core CSS -->
	    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/resources/css/bootstrap/bootstrap.min.css">
	
	    <!-- MetisMenu CSS -->
	    <link href="${pageContext.request.contextPath }/resources/admin/css/metisMenu.min.css" rel="stylesheet" type="text/css">
	
	    <!-- Custom CSS -->
	    <link href="${pageContext.request.contextPath }/resources/admin/css/sb-admin-2.css" rel="stylesheet" type="text/css">

	    <!-- Custom Fonts -->
	    <link href="${pageContext.request.contextPath }/resources/admin/css/font-awesome.css" rel="stylesheet" type="text/css">
	</head>
	<body>
		<tiles:insertAttribute name="header"/>
		<div id="wrapper">
			<div id="page-wrapper">
				<tiles:insertAttribute name="body"/>
			</div>
		</div>
		<!-- jQuery -->
	    <script src="${pageContext.request.contextPath }/resources/js/jquery-1.9.1.min.js"></script>
	
	    <!-- Bootstrap Core JavaScript -->
	    <script src="${pageContext.request.contextPath }/resources/js/bootstrap/bootstrap.min.js"></script>
	
	    <!-- Metis Menu Plugin JavaScript -->
	    <script src="${pageContext.request.contextPath }/resources/admin/js/metisMenu.min.js"></script>
	
	    <!-- Custom Theme JavaScript -->
	    <script src="${pageContext.request.contextPath }/resources/admin/js/sb-admin-2.js"></script>
	</body>
</html>