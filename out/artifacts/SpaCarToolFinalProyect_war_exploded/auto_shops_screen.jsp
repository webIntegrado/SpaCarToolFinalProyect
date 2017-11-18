<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body><h2>List of Auto Shops</h2>
    <div class="w3-container w3-text-grey" id="jeans">
        <p>Talleres <s:property value="type"/> </p>
    </div>
    <div class="w3-row w3-grayscale">
        <s:iterator value="autoShopsByType">
        <div class="w3-container">
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
