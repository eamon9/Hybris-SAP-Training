<%--
  Created by IntelliJ IDEA.
  User: imants.brokans
  Date: 15.02.2023
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<link rel="stylesheet" href="styles.css">

<html>
<title>Low Stock SKU</title>
<body>
<h3>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    <span style="background-color: #530f5e; color: #ffffff; padding: 0 3px;">List all products</span>
</h3>
<h1>
    &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
    ${SKU}
</h1>
<h2>*** lowStockSKU ***</h2>
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
</body>
</html>
