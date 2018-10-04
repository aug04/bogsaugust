<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
DATA: ${model.message}, ${model.title}
<br>
<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>Username</th>
			<th>Email</th>
			<th>DisplayName</th>
			<th>Status</th>
		</tr>
	</thead>
	<tbody>
	<c:forEach var="user" items="${model.users}">
		<tr>
			<td>${user.id}</td>
			<td>${user.userName}</td>
			<td>${user.email}</td>
			<td>${user.displayName}</td>
			<td>
			<c:choose>
				<c:when test="${user.status}"><span style="color: green;">Active</span></c:when>
				<c:otherwise><span style="color: orange;">AInactive</span></c:otherwise>
			</c:choose>
			</td>
		</tr>
	</c:forEach>
	</tbody>
</table>