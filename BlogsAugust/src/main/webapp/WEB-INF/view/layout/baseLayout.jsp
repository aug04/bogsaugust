<%@page pageEncoding="UTF-8" language="java"%>
<%@taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<html>
	<head>
		<meta charset="UTF-8">
		<title>${model.title }</title>
		<link rel="stylesheet" href="${pageContext.request.contextPath }/css/blog.css">
	</head>
	<body>
		<div id="blog-container">
			<div id="blog-header">
				<tiles:insertAttribute name="header" ignore="true"/>
			</div>
			<div id="blog-menu">
				<tiles:insertAttribute name="menu" ignore="true"/>
			</div>
			<div id="blog-body">
				<tiles:insertAttribute name="body" ignore="true"/>
			</div>
			<div id="blog-footer">
				<tiles:insertAttribute name="footer" ignore="true"/>
			</div>
		</div>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.9.1.min.js"></script>
		<script type="text/javascript" src="${pageContext.request.contextPath }/js/blog.js"></script>
	</body>
</html>