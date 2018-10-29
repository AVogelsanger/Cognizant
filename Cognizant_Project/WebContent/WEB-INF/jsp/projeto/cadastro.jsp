<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<tags:template titulo="Cadastro de Projetos">
	<h1>Cadastro de Projeto</h1>
	
	<c:if test="${not empty msg}">
		<div class="alert alert-success">${msg}</div>
	</c:if>
	
	<c:url value="/projeto/cadastrar" var="acao"/>
	
	<form:form action="${acao }" method="post" commandName="projeto">
		<div class="form-group">
			<form:label path="nome">Nome</form:label>
			<form:input path="nome" cssClass="form-control"/>
			<form:errors  path="nome"/>	
		</div>
		<div class="form-group">
			<form:label path="dataInicio">DataInicio</form:label>
			<form:input path="dataInicio" cssClass="form-control"/>
			<form:errors  path="dataInicio"/>	
		</div>
		<div class="form-group">
			<form:label path="dataTermino">DataTermino</form:label>
			<form:input path="dataTermino" cssClass="form-control"/>
			<form:errors  path="dataTermino"/>	
		</div>
		<div class="form-group">
			<form:label path="equipe">Equipes</form:label>
			<form:select path="equipe.codigo" cssClass="form-control">
				<form:option value="0">Selecione</form:option>
				<form:options items="${equipes }" itemLabel="nome" itemValue="codigo"/>
			</form:select>
		</div>		
		<input type="submit" value="cadastrar" class="btn btn-primary"/>
	
	</form:form> 

</tags:template>