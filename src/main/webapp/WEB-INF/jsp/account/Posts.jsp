<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>


<html lang="en">

<head>
    <title>My Posts</title>
    <jsp:include page="../dependencies/Bootstrap.jsp" />
</head>
<body>
<div class="container">
	<h1>My posts</h1>
	
	<jsp:include page="../navbars/LoggedNavbar.jsp" />
		
	<div class="row">
  		<div class="col-sm-6">
  			<h2>Click here to go to post creation.</h2>
  			<button type="button" class="btn btn-default"><a href="/account/posts/create">Post Creation</a></button>
  		</div>
  		<div class="col-sm-6">
  			<h2>Click here to go to post deletion.</h2>
  			<button type="button" class="btn btn-default"><a href="/account/posts/delete">Post Deletion</a></button>
  		</div>
	</div>
    
    <h1>Your posts!</h1>
    
    <jsp:include page="../displays/PostDisplayMyAccount.jsp" />

    </div>
</body>

</html>