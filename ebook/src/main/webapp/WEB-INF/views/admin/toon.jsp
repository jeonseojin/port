<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <ul class="nav nav-tabs">
        <li class="nav-item ad-toon-l">
          <a class="nav-link active" data-toggle="tab" href="#" aria-selected="true" data-target="ad-toon-all">전체작품조회</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-record">작품등록</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-data">작품정보</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-ranking">작품랭킹</a>
        </li>
        <li class="nav-item ad-toon-l">
          <a class="nav-link" data-toggle="tab" href="#" data-target="ad-toon-delete">작품수정/삭제</a>
        </li>
      </ul>
<div class="ad-toon">
	<div class="ad-toon-list ad-toon-all">
		<table class="table table-hover">
			<thead>
				<tr>
					<th>번호</th>
					<th class="adt-plot">제목</th>
					<th>작가</th>
					<th class="adt-plot">줄거리</th>
					<th>찜</th>
					<th>좋아요</th>
					<th>완결여부</th>
				</tr>
			</thead>
			<c:if test="${tlist.size()!=0}">
				<tbody>
					<c:forEach var="toon" items="${tlist}">
						<tr>
							<td>${toon.t_num}</td>
							<td>${toon.title}</td>
							<td>${toon.artist}</td>
							<td>${toon.plot}</td>
							<td>${toon.choice}</td>
							<td>${toon.like}</td>
							<td>${toon.lastEpisode}</td>
						</tr>
					</c:forEach>
				</tbody>
			</c:if>
			<c:if test="${tlist.size()==0}"><h2>검색하신 결과가 없습니다.</h2></c:if>
		</table>
	</div>
	
	<div class="ad-toon-list ad-toon-record">
		<form action="<%=request.getContextPath()%>/admin/toon" method="post" enctype="multipart/form-data">
			<table class="table table-hover">
				<thead>
					<tr>
						<th>제목</th>
						<th><input type="text" class="toon-text-box toon-text-title" name="title" placeholder="제목을 입력하세요"></th>
						<th>작가</th>
						<th><input type="text" class="toon-text-box" name="artist" placeholder="작가를 입력하세요"></th>
						<th>등록관리자</th>
						<th>${member.name}(${member.id})</th>
					</tr>
				</thead>
			</table>
			<div class="ad-plot-box">
				<h4 class="ad-plot-h">줄거리</h4>
				<textarea name="plot" class="ad-plot"></textarea>
				<h4 class="ad-plot-h">대표 이미지</h4>
				<input type="file" name="file2" name="t-img">
				<h4 class="ad-plot-h">장르선택</h4>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">로맨스</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">드라마</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">판타지</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">개그</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">액션</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">학원</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">미스터리</div>
				<div class="check-box"><input type="checkbox" name="g_type" class="checkbox">일상</div>
			</div>
			<button class="btn btn-primary float-right">등록</button>
		</form>
	</div>
	
	<div class="ad-toon-list ad-toon-data"></div>
	<div class="ad-toon-list ad-toon-ranking"></div>
	<div class="ad-toon-list ad-toon-delete"></div>
</div>
<!-- 페이지네이션 -->
<ul class="pagination justify-content-center" style="margin:20px 0">
	<li class="page-item <c:if test="${!tpm.prev}">disabled</c:if>"><a class="page-link" href="<%=request.getContextPath()%>/admin/toon?page=${tpm.startPage-1}&type=${tpm.cri.type}&search=${tpm.cri.search}"><i class="fas fa-chevron-left"></i></a></li>
	<c:forEach var="index" begin="${tpm.startPage}" end="${tpm.endPage}">
		<li class="page-item <c:if test="${index==tpm.cri.page}">active</c:if>"><a class="page-link" href="<%=request.getContextPath()%>/admin/toon?page=${index}&type=${tpm.cri.type}&search=${tpm.cri.search}">${index}</a></li>
	</c:forEach>
	<li class="page-item <c:if test="${!tpm.next}">disabled</c:if>"><a class="page-link" href="<%=request.getContextPath()%>/admin/toon?page=${tpm.endPage+1}&type=${tpm.cri.type}&search=${tpm.cri.search}"><i class="fas fa-chevron-right"></i></a></li>
</ul>
<!-- 검색창 -->
<form action="<%=request.getContextPath()%>/admin/toon">
	<div class="input-group mb-3">
		<select class="form-control " id="sell" name="type">
			<option value="0" <c:if test="${tpm.cri.type==0}">selected</c:if>>전체</option>
			<option value="1" <c:if test="${tpm.cri.type==1}">selected</c:if>>제목</option>
			<option value="2" <c:if test="${tpm.cri.type==2}">selected</c:if>>작가</option>
		</select>
		<input type="text" class="form-control" placeholder="작품 검색" name="search" value="${tpm.cri.search}">
		<div class="input-group-append">
			<button class="btn btn-success " type="submit">검색</button>
		</div>
	</div>
</form>
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