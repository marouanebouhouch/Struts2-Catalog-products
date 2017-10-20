<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: marou
  Date: 20-Oct-17
  Time: 00:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
<div>
    <s:form action="save" method="POST">
        <s:textfield name="product.reference" label="Reference"/>
        <s:textfield name="product.designation" key="designation.label"/>
        <s:textfield name="product.price" label="Price"/>
        <s:textfield name="product.quantity" label="Qantity" />
        <s:checkbox name="product.promotion" label="Promotion"/>
        <s:submit value="Save"/>
    </s:form>
</div>

<div>
    <table border="1">
        <thead>
        <tr>
            <th>Reference</th>
            <th>Designation</th>
            <th>Price</th>
            <th>Quantity</th>
            <th>Promotion</th>
        </tr>
        </thead>
        <tbody>
        <s:iterator value="products">
            <tr>
                <td><s:property value="reference"/></td>
                <td><s:property value="designation"/></td>
                <td><s:property value="price"/></td>
                <td><s:property value="quantity"/></td>
                <td><s:property value="promotion"/></td>
                <s:url namespace="/" action="delete" var="delLink" >
                    <s:param name="reference">
                        <s:property value="reference"/>
                    </s:param>
                </s:url>
                <td><s:a href="%{delLink}">delete</s:a></td>
                <s:url namespace="/" action="edit" var="editLink" >
                    <s:param name="reference">
                        <s:property value="reference"/>
                    </s:param>
                </s:url>
                <td><s:a href="%{editLink}">edit</s:a></td>
            </tr>
        </s:iterator>
        </tbody>
    </table>
</div>

</body>
</html>
