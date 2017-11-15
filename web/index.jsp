<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Login</title>
  </head>
  <body>
    <h2>login</h2>
    <s:form action="loginUser" theme="simple" cssClass="well form-search">
      <s:textfield
              id="email"
              placeholder="Email"
              name="userEmail"/>
      <s:submit
              class="btn btn-primary"
              value="Login User"/>
    </s:form>
    <a href="register_screen.jsp">Sing Up</a>
  </body>
</html>
