<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>번호</th>
			<td>${view.ad_num}</td>
		</tr>
		<tr>
			<th>주소코드</th>
			<td>${view.ad_code}</td>
		</tr>
		<tr>
			<th>시도</th>
			<td>${view.ad_sido}</td>
		</tr>
		<tr>
			<th>구군</th>
			<td>${view.ad_gugun}</td>
		</tr>
		<tr>
			<th>동면읍</th>
			<td>${view.ad_dong}</td>
		</tr>
		<tr>
			<th>리</th>
			<td>${view.ad_lee}</td>
		</tr>
		<tr>
			<th>번지</th>
			<td>${view.ad_bunji}</td>
		</tr>
		<tr>
			<th>호수</th>
			<td>${view.ad_ho}</td>
		</tr>
	
	</table>
	<button onclick="goList()">리스트가기</button>
	<script>
		function goList() {
			location.href = "/addr/list?page=${page}&pageCount=${pageCount}&ad_dong=${param.ad_dong}";
		}
	</script>
</body>
</html>






