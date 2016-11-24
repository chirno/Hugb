<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="content" action="/account/posts/create">
<table>
	<tr>
		<td>Name:</td>
		<td><sf:input class="form-control" path="name" type="text" placeholder="Enter content here" required="required"/></td>
	</tr>
	<tr>
		<td>Content:</td>
		<td><sf:textarea class="form-control" path="content" type="text" placeholder="Enter content here" required="required"/></td>
	</tr>
</table>
<br>
<input class="btn btn-primary" type="submit" VALUE="Create a post!"/>
    </sf:form>
    
  