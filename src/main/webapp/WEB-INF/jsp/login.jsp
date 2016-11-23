<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>Login</title>
        <jsp:include page="dependencies/bootstrapDependencies.jsp" />
    </head>
    <body>
        <div class="container">
          <jsp:include page="navigationBars/navbarNotLogged.jsp" />
			
			<h1>Log in with your login info:</h1>

			<sf:form method="POST" commandName="account" action="/login">
			<jsp:include page="forms/loginForm.jsp" />
			</sf:form>

        </div>
    </body>    
</html>
