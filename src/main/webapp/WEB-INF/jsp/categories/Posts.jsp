<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Category Overview</title>
    <jsp:include page="../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<c:choose>
        <c:when test="${not empty sessionScope.account}">
        	<jsp:include page="navbars/LoggedNavbar.jsp" />
        </c:when>
        <c:otherwise>
            <jsp:include page="navbars/NotLoggedNavbar.jsp" />
        </c:otherwise>
    </c:choose>
	
	
    
    <h1>Posts in current category.</h1>
    
    <jsp:include page="../displays/PostDisplay.jsp" />


    </div>
</body>

</html>