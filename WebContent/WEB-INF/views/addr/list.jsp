<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
			<th>시도</th>
			<th>구군</th>
			<th>동</th>
			<th>리</th>
			<th>번지</th>
			<th>호</th>
			<th>RoadCode</th>
			<th>IsBase</th>
			<th>ORGNUM</th>
			<th>SUBNUM</th>
			<th>JINUM</th>
		</tr>
		<c:forEach items="${list}" var="addr">
			<tr>
				<td>${addr.ad_num}</td>
				<td>${addr.ad_sido}</td>
				<td>${addr.ad_gugun}</td>
				<td><a
					href="/addr/one?ad_num=${addr.ad_num}&ad_dong=${param.ad_dong}">${addr.ad_dong}</a></td>
				<td>${addr.ad_lee}</td>
				<td>${addr.ad_bunji}</td>
				<td>${addr.ad_ho}</td>
				<td>${addr.ad_roadcode}</td>
				<td>${addr.ad_isbase}</td>
				<td>${addr.ad_orgnum}</td>
				<td>${addr.ad_subnum}</td>
				<td>${addr.ad_jinum}</td>

			</tr>
		</c:forEach>
	</table>
</body>
</html>