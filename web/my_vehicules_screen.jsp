<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Mis Vehiculos</title>
</head>
<body>
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
