<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="account" action="/login">
<table>
	<tr>
		<td>Username:</td>
		<td><sf:input path="username" type="text" placeholder="Enter username here"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><sf:input path="password" type="text" placeholder="Enter password here"/></td>
	</tr>
</table>
<br>
<input type="submit" VALUE="Log in"/>
</sf:form>
    
       
        

    