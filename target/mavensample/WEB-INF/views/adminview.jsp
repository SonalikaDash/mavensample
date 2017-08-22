<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />

				
		<form:form action="${contextPath}/admin/insert" method="post" modelAttribute="register">
		
			<form:hidden path="id"/> 
			
			<hr/>		
			<form:input path="Firstname"/>
			
			<hr/>
			
			<form:input path="Lastname"/>
			
			<hr/>
				
			
			<form:input path="Emailid"/>
			
			<hr/>	
			
			<form:input path="Password"/>
			
			<hr/>	
			
			<form:input path="Confirmpwd"/>
			
			<hr/>	
			
			<input type="submit" value="Save"/>
									
		</form:form>	
	
<table>
	<tr>
		<th>Id</th>
		<th>Firstname</th>
		<th>Lastname</th>
		<th>EmailId</th>
		<th>Password</th>
		<th>Confirmpwd</th>
		<th>&#160;</th>
	</tr>

	<c:forEach items="${register}" var="register">	
		<tr>
			<td>${register.id}</td>
			<td>${register.Firstname}</td>
			<td>${register.Lastname}</td>
			<td>${register.Emailid}</td>
			<td>${register.Password}</td>
			<td>${register.Confirmpwd}</td>
			<td>				
				<a href="${contextPath}/admin/edit/${register.id}" class="btn btn-sm btn-primary">View</a>&#160;
				<a href="${contextPath}/admin/delete/${register.id}">Delete</a>			
			</td>		
		</tr>
	</c:forEach>


</table>
