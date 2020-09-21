<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<form action="<%=request.getContextPath()%>/ranking">
    <div class="toon-week-box">
        <a class="toon-week" href="<%=request.getContextPath()%>/toon/ranking?genre=${cri.genre}" aria-selected="true">전체</a>
        <a class="toon-week" href="<%=request.getContextPath()%>/toon/ranking?genre=${cri.genre}">월</a>
    </div>
</form>