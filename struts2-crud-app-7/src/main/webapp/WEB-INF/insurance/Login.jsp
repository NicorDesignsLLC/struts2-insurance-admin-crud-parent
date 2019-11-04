<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Log In</title>
</head>

<body>
<s:form action="Login">
    <h4>Enter your administrator username and password to login to Insurance Agents Administration.</h4> 
    <s:textfield key="username"/>
    <s:password key="password" />
    <s:submit/>
</s:form>
</body>
</html>
