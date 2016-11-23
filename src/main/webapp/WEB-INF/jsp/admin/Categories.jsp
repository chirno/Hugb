<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
<<<<<<< HEAD
    <title>Admin Categories</title>
    <jsp:include page="../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">

	<jsp:include page="../navbars/AdminNavbar.jsp" />
	
	<h1>Create a new category by filling in this form.</h1>
	
	<jsp:include page="../forms/AdminCreateCategoryForm.jsp" />
    
    <h1>Existing categories</h1>
    
    <jsp:include page="../displays/CategoryDisplay.jsp" />
=======
    <title>Categories</title>
    <meta charset="utf-8">
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
	<nav class="navbar navbar-inverse">
	  <div class="container-fluid">
	    <div class="navbar-header">
	      <a class="navbar-brand" href="/">Braskarinn</a>
	    </div>
	    <ul class="nav navbar-nav">
	      <li class="active"><a href="/categories">Categories</a></li>
	      <li><a href="/accounts">Accounts</a></li>
          <li><a href="/profiles">Profiles</a></li>
	    </ul>
	  </div>
	</nav>
	<h1>Categories</h1>
	
	<sf:form method="POST" commandName="category" action="/categories">
    
          <table>
            <tr>
                <td>Name:</td>
                <td><sf:input path="name" type="text" placeholder="Enter category name here"/></td>
            </tr>
        </table>
        <br>
        <input type="submit" VALUE="Create category"/>
        

    </sf:form>
    
    <c:choose>
        <c:when test="${not empty savedCategories}">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="category" items="${savedCategories}">
                            <tr>
                                <td><a href="categories/${category.id}">${category.id}</a></td>
                                <%--The String in the note attribute--%>
                                <td>${category.name}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tr>
                        
                    </tr>
                </table>
            </div>
        </c:when>
        <c:otherwise>
            <h3>No categories!</h3>
        </c:otherwise>
    </c:choose>
>>>>>>> test

    </div>
</body>

</html>