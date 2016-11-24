<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="account" action="/admin/accounts/delete">
<table>
	<tr>
		<td>Username:</td>
		<td><sf:input class="form-control" path="username" type="text" placeholder="Enter username here" required="required"/></td>
	</tr>
	
</table>
<br>
<input class="btn btn-primary" type="submit" VALUE="Delete an account!"/>
    </sf:form>