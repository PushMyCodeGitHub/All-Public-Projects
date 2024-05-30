<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

      
   <form:form action="submitForm" modelAttribute="reservation">
			       First NAme:   <form:input path="firstname"/>
			         LAst NAme:    <form:input path="lastname"/>
          
            <br><br>
               
		               Gender:
		               Male:<form:radiobutton path="Gender" value="Male"/> 
		               FMale:<form:radiobutton path="Gender" value="FMale"/> 
             
               
         				 <br><br>
                   
		               <br><br>
		                   
		                   Meal:
		                   Beakfast:
		                   <form:checkbox path="Food" value="Breakfast"/>
		                   Lunch:
		                   <form:checkbox path="Food" value="lunch"/>
		                   Dinner
		                   <form:checkbox path="Food" value="Dinner"/>
		             <br><br>
          
              
	                     Location From  : 
				                <form:select path="cityFrom">
				                
				                     <form:option value="Pune" lable="Pune"/>
				                       <form:option value="Mumbai" lable="Mumbai"/>
				                         <form:option value="nashik" lable="Nashik"/>
				                
				                
				                </form:select>
                  
		                   Location To  : 
		                <form:select path="cityTo">
		                
		                     <form:option value="Pune" lable="Pune"/>
		                       <form:option value="Mumbai" lable="Mumbai"/>
		                         <form:option value="nashik" lable="Nashik"/>
		                
		                
		                </form:select>
              
              
          
          
          
          <input type="submit" value="submit">
   
   
   </form:form>




</body>
</html>