<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
        <c:when test="${not empty allPosts}">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Category</th>
                            <th>Content</th>
                            <th>Username</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="post" items="${allPosts}">
                            <tr>
                                <td>${post.id}</td>                           
                                <td>${post.category}</td>
                                <td>${post.content}</td>                           
                                <td>${post.account.username}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                   
                </table>
            </div>
        </c:when>
        <c:otherwise>
            <h3>No Posts!</h3>
        </c:otherwise>
    </c:choose>