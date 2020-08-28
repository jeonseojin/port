<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <div class="toon-week-box">
        <button class="toon-week" aria-selected="true">월</button>
        <button class="toon-week">화</button>
        <button class="toon-week">수</button>
        <button class="toon-week">목</button>
        <button class="toon-week">금</button>
        <button class="toon-week">토</button>
        <button class="toon-week">일</button>
        <button class="toon-week">열흘</button>
    </div>
    <div class="toon-box">
        <ul class="toon-list">
            <li class="toon-item">
                <a class="toon-link" href="#">
                    <img src="http://t1.daumcdn.net/webtoon/op/3d6ef2931623e1eab1db5c8b5fb7580987850136" width="148" height="106" class="img_thumb" alt="우리가 헤어진 사이에">
                    <span class="toon-title">우리가 헤어진 사이에</span>
                    <span class="toon-artist">오하</span>
                </a>
            </li>
        </ul>
    </div>
<script>
    $(function(){
        $('.toon-week-box .toon-week').click(function(){
	        $('.toon-week-box .toon-week').attr('aria-selected','false');
            $(this).attr('aria-selected','true');
        })
    })
</script>