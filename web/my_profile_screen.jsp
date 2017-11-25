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
<body class="w3-content" style="max-width:1200px">
<!-- Sidebar/menu -->
<nav class="w3-sidebar w3-bar-block w3-white w3-collapse w3-top" style="z-index:3;width:250px" id="mySidebar">
    <div class="w3-container w3-display-container w3-padding-16">
        <i onclick="w3_close()" class="fa fa-remove w3-hide-large w3-button w3-display-topright"></i>
        <h3 class="w3-wide"><b>Opciones</b></h3>
    </div>
    <div class="w3-padding-64 w3-large w3-text-grey" style="font-weight:bold">
        <s:url var="ajaxTest4" value="/showUserDetail.action" action="showUserDetail">
            <s:param name="userId"><s:property value="userId"/></s:param>
            <s:param name="first_name"><s:property value="first_name"/></s:param>
            <s:param name="last_name"><s:property value="last_name"/></s:param>
            <s:param name="phone"><s:property value="phone"/></s:param>
            <s:param name="userEmail"><s:property value="userEmail"/></s:param>
            <s:param name="address"><s:property value="address"/></s:param>
        </s:url>
        <sj:a id="link4" href="%{ajaxTest4}" targets="div1" class="w3-bar-item w3-button">
            Mi Perfil
        </sj:a>
        <%--<a href="my_profile_screen.jsp" class="w3-bar-item w3-button">Mi Perfil</a>--%>
        <s:url var="ajaxTest3" value="/myVehicules.action" action="myVehicules">
            <s:param name="userId"><s:property value="userId"/></s:param>
        </s:url>
        <sj:a id="link1" href="%{ajaxTest3}" targets="div1" class="w3-bar-item w3-button">
            Mis Vehiculos
        </sj:a>
        <%--<s:a action="myVehicules" class="w3-bar-item w3-button">--%>
            <%--<s:param name="userId"><s:property value="userId"/></s:param>--%>
            <%--Mis Vehiculos--%>
        <%--</s:a>--%>
        <!--Types: concesionario || particular-->
        <s:url var="ajaxTest" value="/getAutoShopsByType.action" action="getAutoShopsByType">
            <s:param name="type">concesionario</s:param>
            <s:param name="userId"><s:property value="userId"/></s:param>
        </s:url>
        <sj:a id="link2" href="%{ajaxTest}" targets="div1" class="w3-bar-item w3-button">
            Talleres Concesionario
        </sj:a>
        <%--<s:a action="getAutoShopsByType" class="w3-bar-item w3-button">--%>
            <%--<s:param name="type">concesionario</s:param>--%>
            <%--<s:param name="userId"><s:property value="userId"/></s:param>--%>
            <%--Talleres Concesionario--%>
        <%--</s:a>--%>
        <s:url var="ajaxTest2" value="/getAutoShopsByType.action" action="getAutoShopsByType">
            <s:param name="type">particular</s:param>
            <s:param name="userId"><s:property value="userId"/></s:param>
        </s:url>
        <sj:a id="link3" href="%{ajaxTest2}" targets="div1" class="w3-bar-item w3-button">
            Talleres Particulares
        </sj:a>
        <%--<s:a action="getAutoShopsByType" class="w3-bar-item w3-button">--%>
            <%--<s:param name="type">particular</s:param>--%>
            <%--<s:param name="userId"><s:property value="userId"/></s:param>--%>
            <%--Talleres Particulares--%>
        <%--</s:a>--%>
    </div>
    <a href="#footer" class="w3-bar-item w3-button w3-padding">Contact</a>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding" onclick="document.getElementById('newsletter').style.display='block'">Newsletter</a>
    <a href="#footer"  class="w3-bar-item w3-button w3-padding">Subscribe</a>
</nav>

<!-- Top menu on small screens -->
<header class="w3-bar w3-top w3-hide-large w3-black w3-xlarge">
    <div class="w3-bar-item w3-padding-24 w3-wide">Opciones</div>
    <a href="javascript:void(0)" class="w3-bar-item w3-button w3-padding-24 w3-right" onclick="w3_open()"><i class="fa fa-bars"></i></a>
</header>

<!-- Overlay effect when opening sidebar on small screens -->
<div class="w3-overlay w3-hide-large" onclick="w3_close()" style="cursor:pointer" title="close side menu" id="myOverlay"></div>

<!-- !PAGE CONTENT! -->
<div id="div1" class="w3-main" style="margin-left:250px">

    <!-- Push down content on small screens -->
    <div class="w3-hide-large" style="margin-top:83px"></div>

    <!-- Top header -->
    <header class="w3-container w3-xlarge">
        <p class="w3-left">Bienvenido <s:property value="first_name"/> <s:property value="last_name"/></p>
    </header>

    <div class="w3-col s4 w3-justify">
        <h4>User Details</h4>
        <p><i class="fa fa-fw fa-map-marker"></i><s:property value="address"/></p>
        <p><i class="fa fa-fw fa-phone"></i> <s:property value="phone"/> </p>
        <p><i class="fa fa-fw fa-envelope"></i> <s:property value="userEmail"/></p>
    </div>
</div>

<!-- Newsletter Modal -->
<div id="newsletter" class="w3-modal">
    <div class="w3-modal-content w3-animate-zoom" style="padding:32px">
        <div class="w3-container w3-white w3-center">
            <i onclick="document.getElementById('newsletter').style.display='none'" class="fa fa-remove w3-right w3-button w3-transparent w3-xxlarge"></i>
            <h2 class="w3-wide">NEWSLETTER</h2>
            <p>Join our mailing list to receive updates on new arrivals and special offers.</p>
            <p><input class="w3-input w3-border" type="text" placeholder="Enter e-mail"></p>
            <button type="button" class="w3-button w3-padding-large w3-red w3-margin-bottom" onclick="document.getElementById('newsletter').style.display='none'">Subscribe</button>
        </div>
    </div>
</div>

<script>


    // Script to open and close sidebar
    function w3_open() {
        document.getElementById("mySidebar").style.display = "block";
        document.getElementById("myOverlay").style.display = "block";
    }

    function w3_close() {
        document.getElementById("mySidebar").style.display = "none";
        document.getElementById("myOverlay").style.display = "none";
    }
</script>
</body>
</html>
