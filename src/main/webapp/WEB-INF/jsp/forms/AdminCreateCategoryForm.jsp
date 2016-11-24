<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="category" action="/admin/categories/create">
    
          <table>
            <tr>
                <td>Name:</td>
                <td><sf:input class="form-control" path="name" type="text" placeholder="Enter category name here" required="required"/></td>
            </tr>
        </table>
        <br>
        <input class="btn btn-primary" type="submit" VALUE="Create a category"/>
        

    </sf:form>