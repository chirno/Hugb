<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="account" action="/admin/accounts/create">
<table>
	<tr>
		<td>Username:</td>
		<td><sf:input class="form-control" path="username" type="text" placeholder="Enter username here" required="required"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><sf:input class="form-control" path="password" type="text" placeholder="Enter password here" required="required"/></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><sf:input class="form-control" path="email" type="text" placeholder="Enter your email here" required="required"/></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><sf:input class="form-control" path="name" type="text" placeholder="Enter your name here" required="required"/></td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td><sf:input class="form-control" path="phone" type="text" placeholder="Enter your phone here" required="required"/></td>
	</tr>
</table>
<br>
<input class="btn btn-primary" type="submit" VALUE="Create an account!"/>
    </sf:form>