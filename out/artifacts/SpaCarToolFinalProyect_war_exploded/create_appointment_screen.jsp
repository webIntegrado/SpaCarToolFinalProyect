<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ taglib prefix="a" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
    <title>Create Appointment</title>
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
