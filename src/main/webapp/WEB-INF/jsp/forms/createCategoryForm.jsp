<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<h1>Categories</h1>
	
	<sf:form method="POST" commandName="category" action="/categories">
    
          <table>
            <tr>
                <td>Name:</td>
                <td><sf:input path="name" type="text" placeholder="Enter category name here"/></td>
            </tr>
        </table>
        <br>
        <input type="submit" VALUE="Create category"/>
        

    </sf:form>