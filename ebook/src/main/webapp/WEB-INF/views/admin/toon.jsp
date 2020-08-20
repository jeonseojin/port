<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <ul class="nav nav-tabs">
        <li class="nav-item ad-toon-l">
          <a class="nav-link active" data-toggle="tab" href="#"  data-target="ad-toon-all">전체작품조회</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" aria-selected="true" data-target="ad-toon-record">작품등록</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-data">작품정보</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-ranking">작품랭킹</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-delete">작품삭제</a>
        </li>
      </ul>
<div class="ad-toon">
	<div class="ad-toon-list ad-toon-all">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작가</th>
					<th class="adt-plot">줄거리</th>
					<th>찜</th>
					<th>좋아요</th>
					<th>완결여부</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${toon.t_num}1</td>
					<td>2</td>
					<td>3</td>
					<td>4</td>
					<td>5</td>
					<td>6</td>
					<td>7</td>
				</tr>
			</tbody>
		</table>
	</div>
	<div class="ad-toon-list ad-toon-record">
		<div class="ad-toon-list ad-toon-all">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th>제목</th>
					<th>작가</th>
					<th class="adt-plot">줄거리</th>
					<th>찜</th>
					<th>좋아요</th>
					<th>완결여부</th>
				</tr>
			</thead>
		</table>
	</div>
            <div class="ad-toon-list ad-toon-data"></div>
            <div class="ad-toon-list ad-toon-ranking"></div>
            <div class="ad-toon-list ad-toon-delete"></div>
</div>
    <script>
	    $(function(){
	        $('.nav .nav-link').click(function(e){
	            e.preventDefault();
	            $('.nav .nav-link').attr('aria-selected','false');
	            $(this).attr('aria-selected','true');
	            adtoonView();
	        })
	    })
        function adtoonView(){
            var target = $('.nav-item .nav-link[aria-selected=true]').attr('data-target');
            $('.ad-toon>.ad-toon-list').addClass('display-none');
            $('.ad-toon .'+target).removeClass('display-none');
        }
        adtoonView();
    </script> 