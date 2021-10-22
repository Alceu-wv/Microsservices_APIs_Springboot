<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>APP2021 - Confirma!!!</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<c:import url="/WEB-INF/jsp/menu.jsp"/>

	<div class="container">

		<c:if test="${not empty message}">
			<div class="alert alert-success">
				<strong>Atenção!</strong> ${message}
			</div>
		</c:if>
		
		<c:if test="${not empty lista}">
	
			<h4>Quantidade de usuários existentes: ${lista.size()}!!!</h4>
			
			<hr>
	
			<table class="table table-striped">
		    <thead>
		      <tr>
		      	<th>Id</th>
		        <th>Nome</th>
		        <th>E-mail</th>
		        <c:if test="${user.admin}">
		        	<th></th>
		        </c:if>
		      </tr>
		    </thead>
		    <tbody>		    
		    	<c:forEach var="u" items="${lista}">
			      <tr>
			        <td>${u.id}</td>
			        <td>${u.nome}</td>
			        <td>${u.email}</td>
			        <c:if test="${user.admin}">
			        	<td><a href="/usuario/${u.id}/excluir">Excluir</a></td>
			      	</c:if>
			      </tr>
		    	</c:forEach>
		    </tbody>
		  	</table>
	  	</c:if>
	  	
	  	<c:if test="${empty lista}">
			<h4>Não existem usuários cadastrados!!!</h4>	  	
	  	</c:if>
	</div>
</body>
</html>