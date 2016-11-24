<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Admin Accounts</title>
    <jsp:include page="../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<jsp:include page="../navbars/AdminNavbar.jsp" />
	
	<div class="row">
  		<div class="col-sm-6">
  			<h2>Click here to go to account creation.</h2>
  			<button type="button" class="btn btn-default"><a href="/admin/accounts/create">Account Creation</a></button>
  		</div>
  		<div class="col-sm-6">
  			<h2>Click here to go to account deletion.</h2>
  			<button type="button" class="btn btn-default"><a href="/admin/accounts/delete">Account Deletion</a></button>
  		</div>
	</div>
	
	
	
	
    
    <h1>Existing accounts</h1>
    
    <jsp:include page="../displays/AccountDisplay.jsp" />

    </div>
</body>

</html>