<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Admin Categories</title>
    <jsp:include page="../../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<jsp:include page="../../navbars/AdminNavbar.jsp" />
	
	<h1>Fill this form to delete a category.</h1>
	
	<jsp:include page="../../forms/AdminDeleteCategoryForm.jsp" />
    
    
    <h1>Existing categories</h1>
    
    <jsp:include page="../../displays/CategoryDisplay.jsp" />

    </div>
</body>

</html>