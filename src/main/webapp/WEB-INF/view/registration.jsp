<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
         .error {
            color: #ff0000;
            font-style: italic;
         }
        </style>
    </head>
    <body>
    <s:url var="formUrl" value="/registrationhandler" />
     <sf:form modelAttribute="reg" action="${formUrl}">

      <fieldset>
        <div>
          <label for="name"><s:message code="reg.name"/>:</label>
          <sf:input path="name" />
          <sf:errors path="name" cssClass="error"/>
        </div>
        <div>
          <label><s:message code="reg.login" />: </label>
          <sf:input path="login"/>
          <sf:errors path="login" cssClass="error"/>
        </div>
        <div>
          <label><s:message code="reg.password" />: </label>
          <sf:input path="password"/>
          <sf:errors path="password" cssClass="error"/>
        </div>
        <div class="submit">
          <button type="submit" name="save"><s:message code="reg.submit" /></button>
        </div>

      </fieldset>

    </sf:form>
    </body>
</html>
