<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
        <c:when test="${not empty savedProfiles}">
            <div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Email</th>
                            <th>Name</th>
                            <th>Rating</th>
                            <th>Settings</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="profile" items="${savedProfiles}">
                            <tr>
                                <td>${profile.id}</a></td>                           
                                <td>${profile.email}</td>
                                <td>${profile.name}</td>
                                <td>${profile.rating}</td>
                                <td>${profile.settings}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                    <tr>
                        
                    </tr>
                </table>
            </div>
        </c:when>
        <c:otherwise>
            <h3>No Profiles!</h3>
        </c:otherwise>
    </c:choose>