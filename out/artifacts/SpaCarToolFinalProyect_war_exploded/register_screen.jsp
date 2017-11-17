<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
</head>
<body>
<s:form action="registerUser" theme="bootstrap" cssClass="well form-vertical">
    <s:textfield
            label="First Name"
            name="firstName"/>

    <s:textfield
            label="Last Name"
            name="lastName"/>

    <s:textfield
            label="Email"
            name="email"/>

    <s:textfield
            label="Phone"
            name="phone"/>

    <s:textfield
            label="Address"
            name="address"/>

    <s:submit value="Register" cssClass="btn btn-primary"/>
    <a href="index.jsp">
        <s:submit value="Cancel" cssClass="btn btn-danger"  />
    </a>
</s:form>
</body>
</html>
