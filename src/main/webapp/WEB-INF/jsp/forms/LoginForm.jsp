<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<sf:form method="POST" commandName="account" action="/login">
<table>
	<tr>
		<td>Username:</td>
		<td><sf:input class="form-control" path="username" type="text" placeholder="Enter username here" required="required"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><sf:input class="form-control" path="password" type="text" placeholder="Enter password here" required="required"/></td>
	</tr>
</table>
<br>
<input class="btn btn-primary" type="submit" VALUE="Log in"/>
</sf:form>

    
       
        

    