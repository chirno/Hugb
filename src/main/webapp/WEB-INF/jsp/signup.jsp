<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>Signup</title>
        <jsp:include page="dependencies/bootstrapDependencies.jsp" />
    </head>
    <body>
        <div class="container">
          <jsp:include page="navigationBars/navbarNotLogged.jsp" />
			
			<h1>Sign up by filling in this form:</h1>

			<sf:form method="POST" commandName="account" action="/signup">
			<jsp:include page="forms/createAccountForm.jsp" />
			</sf:form>

        </div>
    </body>    
</html>
