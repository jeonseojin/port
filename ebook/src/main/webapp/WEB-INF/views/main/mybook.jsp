<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="log-list look">
    <div class="look-box">
		<span class="log-look-span">최근</span>
			<div class="log-look-box">
				<div class="log-look-item">
					<%
						Cookie[] cook = request.getCookies();
					
						if(cook!=null){
							for(int i=0;i<cook.length;i++){
								//쿠키이름 가져오기
								String cookieName=cook[i].getName();
								String cookieValue = cook[i].getValue();
								cook[i].setMaxAge(0);
								response.addCookie(cook[i]);
								out.println("쿠키이름:"+cookieName+"쿠키값:"+cookieValue +"<br/>");
							}
						}
					%>
				    <a href="#" class="log-look-the">더보기</a> 
				</div>
			</div>
			<span class="log-look-span">찜</span>
			<div class="log-look-box">
				<div class="log-look-item">
					<c:if test="${chlist.size()!=0}">
						<c:forEach var="chlist" items="${chlist}">
							<a class="log-look" href="#">
						    	<img class="search-img" src="/ebook/resources/img${chlist.t_img}" style="height: 53px;" alt="">
						    </a>
						</c:forEach>
					</c:if>
				    <a href="#" class="log-look-the">더보기</a> 
				</div>
			</div>
			<span class="log-look-span">소장</span>
			<div class="log-look-box">
				<div class="log-look-item">
					<c:forEach var="payToon" items="${payToon}"> 
						<a class="log-look" href="#">
							<img class="search-img" src="/ebook/resources/img${payToon.t_img}" style="height: 53px;" alt=""> 
						</a>
					</c:forEach>
				<a href="#" class="log-look-the">더보기</a> 
			</div>
		</div>
	</div>
</div>
