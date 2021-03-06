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
    <link rel="stylesheet" type="text/css" href="../css/semantic.min.css">
    <link rel="stylesheet" type="text/css" href="../css/style.css">
    <title>Products</title>
</head>
<body>
<div>
    <s:form action="save" method="POST" cssClass="ui form">
        <s:textfield name="product.reference" label="Reference" />
        <s:textfield name="product.designation" label="Designation"/>
        <s:textfield name="product.price" label="Price"/>
        <s:textfield name="product.quantity" label="Qantity" />
        <s:checkbox name="product.promotion" label="Promotion" cssClass="ui checkbox"/>
        <s:hidden name="editMode" label="EditMode"/>
        <s:submit value="Save" cssClass="ui button"/>
    </s:form>
</div>

<hr/>

<div>
    <table class="ui celled table">
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
