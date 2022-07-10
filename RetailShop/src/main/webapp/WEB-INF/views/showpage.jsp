<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body style="background-color:lavender">
<h1><center> Welcome to Retail Shop </center></h1>
<!--  Do not change the below line -->
<a href="/showPage?language=en">English</a>|<a href="/showPage?language=de">German</a>|<a href="/showPage?language=fr">French</a></align>
<!--  Design the page as per the requirements-->
<center>
	<form:form method="post" modelAttribute="order" action="billDesk" >
	<table>
		<tr>
			<td id="id1"><spring:message code="label.customerName"/></td>
			<td><form:input path="customerName" id="customerName" /></td>
			<td><form:errors path="customerName" id="customerName">
				<spring:message code="error.customerName.blank" />
				</form:errors>
			</td>
		</tr>
		<tr>
			<td id="id2"><spring:message code="label.contactNumber"/></td>
			<td><form:input path="contactNumber" id="contactNumber" /></td>
			<td><form:errors path="contactNumber" id="contactNumber">
				<spring:message code="error.contactNumber.blank" />
				</form:errors>
			</td>
		</tr>
		<tr>
			<td id="id3"><spring:message code="label.couponCode"/></td>
			<td><form:input path="couponCode" id="couponCode" /></td>
			<td><form:errors path="couponCode" id="couponCode">
				<spring:message code="error.couponCode.positive" />
				</form:errors>
			</td>
		</tr>
		<tr>
		   <td id="id4"><spring:message code="label.brandName"/></td>
			<td><form:select path="brandName" id="brandName" items="${ brandList }" /></td>
			
			
		</tr>
		<tr>
			<td id="id5"><spring:message code="label.displayType"/></td>
			<td><form:select path="displayType" id="displayType"  items="${ displayList }"/></td>
			
		</tr>
		<tr>
			<td><input type="submit" value="PlaceOrder" name="submit"></td>
			<td><input type="reset" value="Cancel" name="reset"></td>
		</tr>
		</table>
	</form:form>
</center>


</body>
</html>	 	  	    	    	     	      	 	
