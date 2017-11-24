<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto">
<link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Montserrat">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<head>
    <sj:head/>
    <style>
        .w3-sidebar a {font-family: "Roboto", sans-serif}
        body,h1,h2,h3,h4,h5,h6,.w3-wide {font-family: "Montserrat", sans-serif;}
    </style>
</head>
<body>
    <h2> create Appointment</h2>
    <s:form action="createAppointment"  theme="bootstrap" cssClass="well form-vertical">
        <s:param name="userId"><s:property value="userId"/></s:param>
        <s:param name="autoShopId"><s:property value="autoShopId"/></s:param>
        <s:textfield
                label="Id"
                name="id"/>

        <s:textarea
                cols="20"
                rows="3"
                label="Description"
                name="description"/>

        <s:submit value="Agendar" cssClass="btn btn-primary"/>
        <a href="auto_shop_detail_screen.jsp">
            <s:submit value="Cancel" cssClass="btn btn-danger"  />
        </a>
    </s:form>
</body>
</html>
