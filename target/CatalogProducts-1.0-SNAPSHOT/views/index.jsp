<%--
  Created by IntelliJ IDEA.
  User: marou
  Date: 19-Oct-17
  Time: 23:19
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Index</title>
</head>
<body>
    <s:url namespace="/" action="products" var="link1" />
    <s:a href="%{link1}">Products</s:a>
</body>
</html>
