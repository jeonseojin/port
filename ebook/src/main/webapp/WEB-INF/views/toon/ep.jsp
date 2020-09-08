<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="comic-info" class="comicInfo">
	<img class="comicInfo-img" src="/ebook/resources/img${toon.t_img}" alt="">
    <div class="comicInfo-detail">
        <h2 class="comicInfo-title">${toon.title}</h2>
    </div>
</div>