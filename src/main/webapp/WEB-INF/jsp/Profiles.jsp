<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Profiles</title>
    <jsp:include page="dependencies/bootstrapDependencies.jsp" />
</head>
<body>
	<div class="container">

	<jsp:include page="navigationBars/navbarAdmin.jsp" />
    <jsp:include page="choices/profileDisplay.jsp" /> 	
	
    </div>
</body>

</html>