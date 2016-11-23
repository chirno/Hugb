 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:choose>
	<c:when test="${not empty errorMessage}">
		<h2>${errorMessage.errorMessage}</h2>
	</c:when>
</c:choose>