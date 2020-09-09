<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<div id="comic-info" class="comicInfo">
	<img class="comicInfo-img" src="/ebook/resources/img${toon.t_typify}" alt="">
	<div class="comicInfo-Epdetail">
	    <h2 class="comicInfo-title">${toon.title}</h2>
	    <div class="comicInfo-genre"><a class="link-comic-genre">${toon.t_code}</a></div>
	    <div class="comicInfo-plot">${toon.plot}</div>
	    <div class="comicInfo-Ulike">
	    	<button class="comicInfo-btn-choice">찜하기<i class="far fa-heart"></i></button>
	    	<button class="comicInfo-btn-updown"><i class="far fa-hand-point-up"></i></button>
	    	<button class="comicInfo-btn-updown"><i class="far fa-hand-point-down"></i></button>
	    </div>
    </div>
</div>