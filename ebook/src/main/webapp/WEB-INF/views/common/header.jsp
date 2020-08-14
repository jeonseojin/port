<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 상단 header -->
    <header id="main-header" class="com com-menu">
        <a class="gnb-logo" href="<%=request.getContextPath()%>/"></a>
        <!-- 공통메뉴 -->
        <nav id="gnb" class="gnb">
            <ul class="gnb-list">
                <li class="gnb-item">
                    <a class="gnb-link" href="<%=request.getContextPath()%>/s">연재</a>
                </li>
                <li class="gnb-item">
                    <a class="gnb-link" href="<%=request.getContextPath()%>/">랭킹</a>
                </li>
                <li class="gnb-item">
                    <a class="gnb-link" href="<%=request.getContextPath()%>/">무료</a>
                </li>
                <li class="gnb-item">
                    <a class="gnb-link" href="<%=request.getContextPath()%>/">이벤트</a>
                </li>
                <li class="gnb-item">
                    <a class="gnb-link" href="<%=request.getContextPath()%>/">완결</a>
                </li>
            </ul>
        </nav>
        <!-- 검색창 -->
        <button class="search-btn"></button>
        <div class="search display-none">
            <fieldset class="search-field">
                <input type="text" class="search-input" placeholder="작품/작가명을 검색해주세요.">
                <div class="search-list display-none" >
                    <a href="#" class="search-item">
                        <div class="search-thumb">
                            <img class="search-img" src="https://cdn.lezhin.com/v2/comics/5331411003506688/images/thumbnail?updated=1464059206774&amp;width=100" alt="">
                        </div>
                        <p class="search-title">제목(방과후 개그부)</p>
                        <p class="search-artist">작가(타카시마 히로미)</p>
                    </a>
                    <a href="#" class="search-item">
                        <div class="search-thumb">
                            <img class="search-img" src="https://cdn.lezhin.com/v2/comics/5331411003506688/images/thumbnail?updated=1464059206774&amp;width=100" alt="">
                        </div>
                        <p class="search-title">제목(방과후 개그부)</p>
                        <p class="search-artist">작가(타카시마 히로미)</p>
                    </a>
                </div>
                <button class="search-filed-btn"></button>
            </fieldset>
        </div>

        <!-- 로그인 -->
        <c:if test="${member==null}">
	        <form method="post" action="<%=request.getContextPath()%>/common/signin" class="login-form">
	        	<div class="account">
			        <button type="button" class="logNav-btn">
			            <b class="logNav-text">로그인</b>
			            <i class="logNav_notiNum"></i>
			        </button>
			        <nav class="logNav display-none">
			            <div class="logNav-before">
			                <h2 class="login-heading">로그인</h2>
							<input type="text" class="login-input" name="id" placeholder="아이디">
							<input type="password" class="login-input" name="pw" placeholder="비밀번호">
							<br>
							<button type="submit" class="login-btn">Login</button>		
							<input type="hidden" value="${isLogin}" id="isLogin">
							<input type="hidden" value="${id}" id="id">
			            </div>
			        </nav>
		        </div>
	        </form>
        </c:if>
        <c:if test="${member!=null}">
        	<div class="account">
			        <button type="button" class="logNav-btn">
			            <b class="logNav-text">${member.name}</b>
			            <i class="logNav_notiNum"></i>
			        </button>
		    </div>
        </c:if>
    </header>
