<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div class="epscroll-box">
	<ul>
		<c:forEach var="eplist" items="${eplist}">
		<li><img src="/ebook/resources/img${eplist.e_img}"></li>
		</c:forEach>
	</ul>	
</div>
<div class="epcomment-box">
	<div class="eptit-cmt">댓글
		<span class="eptit-cmt-count">(<span>1</span>)</span>
		<a class="eptit-i-btn"><i class="fas fa-exclamation-circle"></i></a>
	</div>
	<div class="box-comment">
		<c:if test="${member.name!=null}">
			<div class="epcomment-regist">
				<span class="epregist-name">${member.name}1</span>
				<div class="epcomment-submit">
					<textarea class="epregist-text"></textarea>
					<button class="epcomment-btn-submit">댓글달기</button>
				</div>
			</div>
		</c:if>
		<c:if test="${member.name==null}">
		<form action="#">
			<div class="epcomment-regist">
				<span class="epregist-name">${member.name}1</span>
				<div class="epcomment-submit">
					<textarea class="epregist-text"></textarea>
					<button class="epcomment-btn-submit">댓글달기</button>
				</div>
			</div>
			<input type="hidden" name="co_member" value="${member.name}">
		</form>
		</c:if>
		<div class="epcmt-box">
		</div>
	</div>
	
</div>