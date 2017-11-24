<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
    <title>Registro</title>
    <style>
        .w3-sidebar a {font-family: "Roboto", sans-serif}
        body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
    </style>
</head>
<body>
<div class="w3-row-padding w3-center">
    <div class="w3-col s4">
        <h2>Registra tus datos</h2>
<s:form action="registerUser" theme="bootstrap" cssClass="well form-search">
    <s:textfield
            class="w3-input w3-border"
            label="First Name"
            name="firstName"/>

    <s:textfield
            class="w3-input w3-border"
            label="Last Name"
            name="lastName"/>

    <s:textfield
            class="w3-input w3-border"
            label="Email"
            name="email"/>

    <s:textfield
            class="w3-input w3-border"
            label="Phone"
            name="phone"/>

    <s:textfield
            class="w3-input w3-border"
            label="Address"
            name="address"/>

    <s:submit value="Register" class="w3-button w3-block w3-black"/>
    <a href="index.jsp">
        <s:submit value="Cancel" class="w3-button w3-red w3-margin-bottom"  />
    </a>
</s:form>
    </div>
</div>
</body>
</html>
