<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html lang="en">

    <head>
        <title>User Login</title>
        <jsp:include page="../dependencies/Bootstrap.jsp" />
    </head>
    <body>
        <div class="container">
            <jsp:include page="../navbars/NotLoggedNavbar.jsp" />

        <h1>Trying to log in are you? </h1>
        <h2>Well fill in this form then and let's be on our way</h2>
        
        
		<jsp:include page="../forms/LoginForm.jsp" />
		
        
        <jsp:include page="../displays/ErrorMessage.jsp" />
       
        </div>
    </body>    
</html>
