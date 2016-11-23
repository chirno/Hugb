<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
        <c:when test="${not empty savedAccounts}">
        	<div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>

                            <th>Username</th>
                            <th>Password</th>
                            <th>Email</th>
                            <th>Name</th>
                            <th>Phone</th>

                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="account" items="${savedAccounts}">
                            <tr>

                                <td>${account.username}</td>
                                <td>${account.password}</td>
                                <td>${account.email}</td>
                                <td>${account.name}</td>
                                <td>${account.phone}</td>

                            </tr>
                        </c:forEach>
                    </tbody>
                    <tr>
                        
                    </tr>
                </table>
             </div>
        </c:when>
        <c:otherwise>
            <h3>No Accounts!</h3>
        </c:otherwise>
    </c:choose>