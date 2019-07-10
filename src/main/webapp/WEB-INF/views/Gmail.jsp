<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELOCME TO GMAIL PORTAL</title>

<style>
div {
  background-color: lightgrey;
  width: 565px;
  border: 5px solid black;
  padding: 50px;
  margin: 20px;
}

</style>


</head>
<body>
<div>
<form:form action="send" method="Post" modelAttribute="gmailModel" enctype="multipart/form-data">
<pre>

   <label>To</label>        :<form:input path="to"/>        <lable>Bcc</lable>  : <form:input path="bcc"/> 

   <lable>Sub</lable>       :<form:input path="sub"/>       <lable>cc</lable>   : <form:input path="cc"/>

  <lable>Text</lable>       :<form:textarea  path="text"/>

  <lable>Attachement</lable>:<input type="file" name="file">

	  <input type="submit" value="submit">  


</pre>
</form:form>

<h6 style="text-align: center;color: red">${message}</h6>
</div>



</body>
</html>