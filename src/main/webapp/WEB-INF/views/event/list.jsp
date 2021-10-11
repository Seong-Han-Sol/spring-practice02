<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이벤트 목록</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>이벤트 번호</th>
				<th>이벤트 이름</th>
				<th>시작일</th>
				<th>종료일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${eList}" var="list">
				<tr>
					<td><c:out value="${list.id }"></c:out> </td>
					<td><c:out value="${list.title }"></c:out> </td>
					<td><c:out value="${list.startTime }"></c:out> </td>
					<td><c:out value="${list.endTime }"></c:out> </td>
				</tr>			
			</c:forEach>
		</tbody>

	</table>
</body>
</html>