<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
                                <td><a href="/categories/${category.id}">${category.id}</a></td>                           
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