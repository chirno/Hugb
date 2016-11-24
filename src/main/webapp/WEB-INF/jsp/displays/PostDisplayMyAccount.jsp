<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
        <c:when test="${not empty myPosts}">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Category</th>
                            <th>Content</th>
                            
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="post" items="${myPosts}">
                            <tr>
                                <td>${post.id}</td>                           
                                <td>${post.category.name}</td>
                                <td>${post.content}</td>                           
                                
                            </tr>
                        </c:forEach>
                    </tbody>
                   
                </table>
            </div>
        </c:when>
        <c:otherwise>
            <h3>You have no posts!</h3>
        </c:otherwise>
    </c:choose>