<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head><title>Save User Data</title></head>
<body>
<h3>Save User name ${userName} saved to Database</h3>
<form:form action="/save" method="post">
  User Name:<input type="text" name="userName"> <br/>
  Age :<input type="text" name="age"/><br/>
  <input type="submit" value="Submit"/>
</form:form>
</body>
</html> 