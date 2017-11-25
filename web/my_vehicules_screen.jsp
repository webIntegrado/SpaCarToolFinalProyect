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
<!-- Push down content on small screens -->
<div class="w3-hide-large" style="margin-top:83px"></div>
    <div class="w3-container w3-text-grey" id="jeans">
        <p>Mis Vehiculos</p>
    </div>
    <div class="w3-row w3-grayscale">
        <s:iterator value="vehiculesFromUser">
            <div class="w3-container">
                <div class="w3-display-container">
                    <img src="https://cdn.pixabay.com/photo/2017/11/10/16/38/opel-2936765__340.png" height="300" width="300">
                    <div class="w3-display-middle w3-display-hover">
                        <button class="w3-button w3-black">Detalles<i class="fa fa-shopping-cart"></i></button>
                    </div>
                </div>
                <p><s:property value="brand"/>, <s:property value="model"/>
                    <br><b>Comprado: <s:property value="yearBought"/></b>
                    <br><b>Placa: <s:property value="palte"/></b>
                </p>
            </div>
        </s:iterator>
    </div>
</body>
</html>
