<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Admin Categories</title>
    <jsp:include page="../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<jsp:include page="../navbars/AdminNavbar.jsp" />
	
	<div class="row">
  		<div class="col-sm-6">
  			<h2>Click here to go to category creation.</h2>
  			<button type="button" class="btn btn-default"><a href="/admin/categories/create">Category Creation</a></button>
  		</div>
  		<div class="col-sm-6">
  			<h2>Click here to go to category deletion.</h2>
  			<button type="button" class="btn btn-default"><a href="/admin/categories/delete">Category Deletion</a></button>
  		</div>
	</div>
    
    <h1>Existing categories</h1>
    
    <jsp:include page="../displays/CategoryDisplay.jsp" />


    </div>
</body>

</html>