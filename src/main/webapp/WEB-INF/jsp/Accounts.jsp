<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<html lang="en">

<head>
    <title>Accounts</title>
    <jsp:include page="dependencies/bootstrapDependencies.jsp" />
</head>
<body>
	<div class="container">

	<jsp:include page="navigationBars/navbarAdmin.jsp" />
	<h1>Accounts</h1>

	<sf:form method="POST" commandName="account" action="/accounts">
	<jsp:include page="forms/createAccountForm.jsp" />
	</sf:form>
    <jsp:include page="choices/accountDisplay.jsp" /> 	
	
    </div>
</body>

</html>