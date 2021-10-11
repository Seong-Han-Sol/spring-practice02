<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>이벤트 등록</title>
</head>
<body>

<form action="/event/new" method="post">
제목 : <input type="text" id="title" name="title"><br>
시작일 : <input type="date" id="startDate" name="startTime">
종료일 : <input type="date" id="startDate" name="startTime">
<input type="submit" value="전송">
</form>
</body>
</html>