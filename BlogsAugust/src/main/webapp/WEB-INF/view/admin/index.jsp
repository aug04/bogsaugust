<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
</head>
<body>
admin page
	<!-- TODO: check session and redirect to login page -->
	<%-- <c:if test="${sessionScope['user'] eq null}">
		<c:set var="redirectUrl" value="${pageContext.request.contextPath }/common/auth/login"/>
		<script type="text/javascript">
			window.location.href = '${redirectUrl}';
		</script>
	</c:if> --%>
	<!-- redirect to dashboard -->
</body>
</html>