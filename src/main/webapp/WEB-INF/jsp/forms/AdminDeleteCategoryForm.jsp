<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<sf:form method="POST" commandName="category" action="/admin/categories/delete">
    
          <table>
            <tr>
                <td>Id:</td>
                <td><sf:input class="form-control" path="id" type="text" placeholder="Enter category id here" required="required"/></td>
            </tr>
        </table>
        <br>
        <input class="btn btn-primary" type="submit" VALUE="Delete a category"/>
        

    </sf:form>