<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Delete Post</title>
    <jsp:include page="../../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<jsp:include page="../../navbars/LoggedNavbar.jsp" />
	
	<h1>Fill this form to delete a post.</h1>
	
	<jsp:include page="../../forms/AccountDeletePost.jsp" />	
    
    <h1>Your posts!</h1>
    
    <jsp:include page="../../displays/PostDisplayMyAccount.jsp" />

    </div>
</body>

</html>