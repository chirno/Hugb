<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:choose>
        <c:when test="${not empty savedAccounts}">
        	<div class="table-responsive">
                <table class="table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Username</th>
                            <th>Password</th>
                           
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="account" items="${savedAccounts}">
                            <tr>
                                <td><a href="/accounts/${account.id}">${account.id}</a></td>
                                <td>${account.username}</td>
                                <td>${account.password}</td>
                                
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