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
<h2>
    <span style="background-color: #530f5e; color: #ffffff; padding: 0 3px;">
        *** lowStockSKU ***
    </span>
</h2>
<h4>List of ${listSize} products and their warehouses, </h4>
<h4>where the product in warehouse is less than 5 pieces</h4>
<h6>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <img src="https://htmlcodeeditor.com/images/smiley.png" alt="smiley" />
</h6>
<table border="1">
    <thead>
    <tr>
        <th>Code</th>
        <th>Name</th>
        <th>Approval Status</th>
        <th>Warehouse</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="product" items="${products}">
        <tr>
            <td>${product.code}</td>
            <td>${product.name}</td>
            <%--<td>${product.Warehouse}</td>--%>
            <td>${product.approvalStatus}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
