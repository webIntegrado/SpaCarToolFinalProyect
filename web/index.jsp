<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <h2>login</h2>
    <s:form action="loginUser" method="POST">
      <s:label for="email" value="User Email"/>
      <s:textfield id="email" name="userEmail"/>
      <s:submit value="Login User"/>
    </s:form>
    <a href="register_screen.jsp">Sing Up</a>
  </body>
</html>
