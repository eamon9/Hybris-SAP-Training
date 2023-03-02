<%--
  Created by IntelliJ IDEA.
  User: imants.brokans
  Date: 02.03.2023
  Time: 17:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<style>
    body {
        background-color: #e0dbdb;
        font-family: "Arial Black", Helvetica, sans-serif;
        color: #000000;
    }
</style>
<head>
    <title>Low Stock SKU</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Stock Level</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.code}</td>
            <td>${product.name}</td>
            <td>${product.stockLevel}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
