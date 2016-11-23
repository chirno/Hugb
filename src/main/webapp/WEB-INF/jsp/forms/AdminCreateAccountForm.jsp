<sf:form method="POST" commandName="account" action="admin/accounts">
    
    <tr>
		<td>Username:</td>
		<td><sf:input path="username" type="text" placeholder="Enter username here"/></td>
	</tr>
	<tr>
		<td>Password:</td>
		<td><sf:input path="password" type="text" placeholder="Enter password here"/></td>
	</tr>
	<tr>
		<td>Email:</td>
		<td><sf:input path="email" type="text" placeholder="Enter your email here"/></td>
	</tr>
	<tr>
		<td>Name:</td>
		<td><sf:input path="name" type="text" placeholder="Enter your name here"/></td>
	</tr>
	<tr>
		<td>Phone:</td>
		<td><sf:input path="phone" type="text" placeholder="Enter your phone here"/></td>
	</tr>
        <br>
        <input type="submit" VALUE="Create account"/>
        

    </sf:form>