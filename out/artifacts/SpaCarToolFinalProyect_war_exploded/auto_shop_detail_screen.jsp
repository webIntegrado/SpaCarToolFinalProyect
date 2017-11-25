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
        div {
            height: 200px;
            width: 50%;
            padding: 25px;
            text-align: center;
        }
    </style>
</head>
<body>
<div id="div1"  class="w3-main" style="margin-left:250px">
    <!-- Push down content on small screens -->
    <div class="w3-hide-large" style="margin-top:83px"></div>
    <div class="w3-col s4 w3-justify">
        <h4><s:property value="name"/></h4>
        <p>Tipo: <s:property value="type"/></p>
        <p><i class="fa fa-fw fa-map-marker"></i><s:property value="address"/></p>

    <s:a action="goToCreateAppointment">
        <s:param name="userId"><s:property value="userId"/> </s:param>
        <s:param name="autoShopId"><s:property value="autoShopId"/> </s:param>
        <button class="w3-button w3-block w3-black">Create Appointment</button>
    </s:a>
    </div>
</div>
</body>
</html>
