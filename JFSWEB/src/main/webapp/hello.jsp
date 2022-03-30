<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>helloeveryone</title>
</head>
<body>
<body style="background-color:yellow;">
<form method="post" action="Myservlet">
   <table>
     <tr>
        <td> pid</td>
        <td><input type="text" name="pid" value="12"></td>
     </tr>
<tr>
     <td>pname</td>
     <td><input type="text" name="pname" value="xxxxx"></td>
  </tr>
 <tr>
        <td> price</td>
           <td><input type="text" name="price" value="2000"></td>
  </tr>
<tr>
        <td> offer</td>
        <td><input type="text" name="offer" value="10"></td>
  </tr>
<tr>
    <td><input type="submit" value="productpage"></td>
   </tr>
 </table>
</form>
</body>
</html>