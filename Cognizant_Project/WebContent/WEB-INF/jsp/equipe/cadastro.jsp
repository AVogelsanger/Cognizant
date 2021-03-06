<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tags:template titulo="Cadastro de Equipes">
	<h1>Cadastro de Equipes</h1>
	
	<c:if test="${not empty msg}">
		<div class="alert alert-success">${msg}</div>
	</c:if>
	
	<c:url value="/equipe/cadastrar" var="acao"/>
	
	<form:form action="${acao }" method="post" commandName="projeto">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" cssClass="form-control"/>
			<form:errors  path="nome"/>	
		</div>
				<div class="form-group">
			<form:label path="departamento">Departamento</form:label>
			<form:input path="departamento" cssClass="form-control"/>
			<form:errors  path="departamento"/>	
		</div>
		
		<input type="submit" value="cadastrar" class="btn btn-primary"/>
	
	</form:form> 

</tags:template>