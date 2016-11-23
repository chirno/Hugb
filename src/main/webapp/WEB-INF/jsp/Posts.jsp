<!DOCTYPE html>

<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>Categories</title>
    <jsp:include page="dependencies/bootstrapDependencies.jsp" />
</head>
<body>
<div class="container">
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
                                <td><a href="/categorie/${category.id}">${category.id}</a></td>
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

    </div>
</body>

</html>