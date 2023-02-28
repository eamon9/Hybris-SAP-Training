<%@ page import="java.util.List" %>
<%@ page import="de.hybris.training.facades.product.data.TrainingSkuData" %><%--
  Created by IntelliJ IDEA.
  User: imants.brokans
  Date: 15.02.2023
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<style>
    body {
        background-color: #e0dbdb;
        font-family: "Arial Black", Helvetica, sans-serif;
        color: #000000;
    }
</style>
<title>Low Stock SKU</title>
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
<br>
<c:forEach var="name" items="${products}">
    <c:out value="${name}"/><br>
</c:forEach>

<h4>(((( END ))))</h4>

<table>
    <thead>
    <tr>
        <th>Product Name</th>
        <th>Description</th>
    </tr>
    </thead>
    <tbody>
    <%--<%
        List<TrainingSkuData> skuData = (List<TrainingSkuData>) request.getAttribute("name");
        for (TrainingSkuData ignored : skuData) {
    %>--%>
    <tr>
        <%--<td>${products}></td>
        <td>${name} ></td>--%>
    </tr>
    </tbody>
</table>

</body>
</html>
