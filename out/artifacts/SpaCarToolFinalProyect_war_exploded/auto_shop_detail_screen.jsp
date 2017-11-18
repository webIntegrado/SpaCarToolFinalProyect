<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <div class="w3-col s4 w3-justify">
        <h4><s:property value="name"/></h4>
        <p>Tipo: <s:property value="type"/></p>
        <p><i class="fa fa-fw fa-map-marker"></i><s:property value="address"/></p>
    </div>
    <s:a action="goToCreateAppointment">
        <s:param name="userId"><s:property value="userId"/> </s:param>
        <s:param name="autoShopId"><s:property value="autoShopId"/> </s:param>
        <button class="w3-button w3-block w3-black">Create Appointment</button>
    </s:a>

</body>
</html>
