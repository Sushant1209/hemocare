<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href='<c:url value="resources/styles/bootstrap.min.css"/>' rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<h3 class"text-primary"> Blood Donor Details</h3>
<table class="table table-striped table-bordered">
<thead>
<tr>
<th>Donor_id</th>
<th>User_id</th>
<th>Full Name</th>
<th>Blood_type</th>
<th>Contact_number</th>
<th>Availability_status</th>
<th>Location</th>
</tr>
</thead>
<tbody>
<c:forEach var="donors" items="${donors}">
<tr>
<td>${donors.donor_id}</td>
<td>${donors.user_id}</td>
<td>${donors.name}</td>
<td>${donors.blood_type}</td>
<td>${donors.contact_number}</td>
<td>${donors.availability_status}</td>
<td>${donors.location}</td>
</tr>

</c:forEach>

</tbody>
</table>
</div>
</body>
</html>