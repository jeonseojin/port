<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<title>포트폴리오</title>
		<jsp:include page="/WEB-INF/views/include/head.jsp"></jsp:include>
	</head>
	<body>
	    <tiles:insertAttribute name="header"/>
	    <div class="container com com-home">        
			<tiles:insertAttribute name="body" />
		</div>                                                  
		<tiles:insertAttribute name="footer" />
	</body>
</html>