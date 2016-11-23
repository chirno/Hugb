 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
	<c:when test="${not empty sessionScope.account}">
		<h2>${sessionScope.account}</h2>
	</c:when>
	<c:otherwise>
    	<h3>Not logged in!</h3>
    </c:otherwise>
</c:choose>