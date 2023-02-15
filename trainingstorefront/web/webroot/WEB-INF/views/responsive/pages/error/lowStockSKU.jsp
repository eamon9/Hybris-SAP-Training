<%--
  Created by IntelliJ IDEA.
  User: imants.brokans
  Date: 15.02.2023
  Time: 09:53
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<title>Stock2</title>
<body>
<h1>${SKU}</h1>
<c:forEach var="name" items="${products}">
    <c:out value="${name}"/><br>
</c:forEach>
</body>
</html>
