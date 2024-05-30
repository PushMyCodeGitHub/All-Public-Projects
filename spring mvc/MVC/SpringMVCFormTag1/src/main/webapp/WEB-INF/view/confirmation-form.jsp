<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ page isELIgnored="false" %>
       <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h1>Confir your Reservation !!!!</h1>
   
      First NAme:- ${reservation.firstname}
      Last NAme:  ${reservation.lastname}
      
      Gender :  ${reservation.gender}
         
         Meals:
         
         <ul>
             <c:forEach var="meal" items="${reservation.food}" >
             
             <li>${meal}</li>
             </c:forEach>
             
         </ul>
         
        from : ${reservation.cityFrom} 
        To:${reservation.cityTo}

</body>
</html>