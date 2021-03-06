<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<tags:template titulo="Lista de Projetos">

	<h1>Lista de Projetos</h1>

	<table class="table">
	   <tr>	
		<th>Nome</th>
		<th>Data In�cio</th>
		<th>Data T�rmino</th>
		<th>Equipes</th>
	   </tr>	
	   
	   <c:forEach items="${projetos }" var="p">
	   	 <tr>
	   	 	<td>${p.nome }</td>
	   	 	<td>
	   	 		<fmt:formatDate value="${p.dataInicio.time }"/>
	   	 	</td>
	   	 	<td>
	   	 		<fmt:formatDate value="${p.dataTermino.time }"/>
	   	 	</td>
	   	 	<td>${p.equipe.nome }</td>
	   	 </tr>	
	   </c:forEach>
	</table>
		
</tags:template>