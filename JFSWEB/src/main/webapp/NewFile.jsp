<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
<meta charset="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
     
          <c:set var="String" value="Welcome to forenoon's Session"/>
    
          <c:set var="String" value="Welcome to forenoon's Session"/>
      <c:if test="${fn:contains(String, 'Session')}">  
   <p>yes.....String contains the word session<p>  
</c:if>  
 <c:if test="${fn:contains(String, 'Welcome')}">  
   <p>yes.....String contains the word welcome is also<p>
   </c:if>           
 
   <h2> Good afternoon </h2>
  
   
   <c:out value="${'<h2> Good afternoon </h2>' }"/>
   
   <c:forEach var="pname" begin="2" end="3">Item
   		<c:out value="${a}" />
	    </c:forEach>
	     <a href="<c:url value="/hello.jsp"/>">Home Page</a> 
   
  <%
  out.println(request.getClass());
  out.println("\n<h5>)"+application.getContextPath()+"\n<h5>");
 out.println("\n<h5>)"+ page.getClass ()+"\n from poage <h5>");
 out.println("\n<h5>"+ config.getClass()+"\n from config<h5>");
 
  int len=request.getContentLength();
  out.println(len);
  String s=page.toString();
   %>
   
</body>
</html>