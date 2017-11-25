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
<body><h2>List of Auto Shops</h2>
        <div id="div1"  class="w3-main" style="margin-left:250px">
            <p>Talleres <s:property value="type"/> </p>

        <div class="w3-row w3-grayscale">
            <s:iterator value="autoShopsByType">
            <div class="w3-container">
                <!------------------------------->
                <%--<s:url var="ajaxTest" value="/getAutoShopDetail.action">--%>
                    <%--<s:param name="autoShopId"><s:property value="id"/></s:param>--%>
                    <%--<s:param name="userId"><s:property value="userId"/></s:param>--%>
                <%--</s:url>--%>
                <%--<sj:a id="link4" href="%{ajaxTest}" targets="div1" class="w3-bar-item w3-button">--%>
                    <%--<div class="w3-display-container">--%>
                        <%--<img src="https://cdn.pixabay.com/photo/2015/09/16/20/11/garage-943249__340.jpg" width="200" height="200">--%>
                        <%--<div class="w3-display-middle w3-display-hover">--%>
                            <%--<button class="w3-button w3-black">Detalles<i class="fa fa-shopping-cart"></i></button>--%>
                        <%--</div>--%>
                    <%--</div>--%>
                <%--</sj:a>--%>
                <!-------------------------------->
                <s:a action="getAutoShopDetail">
                    <s:param name="autoShopId"><s:property value="id"/></s:param>
                    <s:param name="userId"><s:property value="userId"/></s:param>
                    <div class="w3-display-container">
                        <img src="https://cdn.pixabay.com/photo/2015/09/16/20/11/garage-943249__340.jpg" width="200" height="200">
                        <div class="w3-display-middle w3-display-hover">
                            <button class="w3-button w3-black">Detalles<i class="fa fa-shopping-cart"></i></button>
                        </div>
                    </div>
                </s:a>
            </div>
            <p><s:property value="name"/></p>
            </div>
            </s:iterator>
        </div>
</body>
</html>
