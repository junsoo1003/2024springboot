<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: yoonseojin
  Date: 2024. 10. 8.
  Time: 오후 2:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <c:forEach items="${members}" var="member">
      ${member.id} /	${member.name} / ${member.email}
      <hr>
  </c:forEach>
</body>
</html>
