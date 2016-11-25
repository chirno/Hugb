<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="content" action="/account/posts/create">
<table>
	<tr>
		<td>Name:</td>
		<td><sf:input class="form-control" path="categoryName" type="text" placeholder="Enter category name here" required="required"/></td>
	</tr>
	<tr>
		<td>Content:</td>
		<td><sf:textarea class="form-control" path="postContent" type="text" placeholder="Enter post content here" required="required"/></td>
	</tr>
</table>
<br>
<input class="btn btn-primary" type="submit" VALUE="Create a post!"/>
    </sf:form>
    
  