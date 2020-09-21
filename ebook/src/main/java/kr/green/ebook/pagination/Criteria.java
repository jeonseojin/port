package kr.green.ebook.pagination;

public class Criteria {
	private int page;//한 페이지 당 컨텐츠 갯수
	private int perPageNum;
	private int type;
	private int cweek;
	private String search;
	private int event;
	private String notice;//고객센터의 조건
	private String genre;//작품 장르
	
	//Criteria 디폴트 생성자 : 현재 페이지를 1페이지로, 한 페이지에 10개의 컨텐츠
	public Criteria() {
		page = 1;
		perPageNum = 10;
		search="";
		type=1;
		cweek=1;
		notice="service";
		genre ="로맨스";
	}
	//getter and setter
	
	public int getPage() {
		return page;
	}
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setPage(int page) {//현재 페이지 번호를 음수로 설정하려 할 때
		if(page <= 0) {
			this.page = 1;
		}
		else
			this.page = page;
	}
	public int getPerPageNum() {
		return perPageNum;
	}
	public void setPerPageNum(int perPageNum) {// 한  페이지에 보이는 최대 수량을 설정
		if(perPageNum < 10) {
			this.perPageNum = 10;
		}
		else
			this.perPageNum = perPageNum;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type=(type < 0 || type > 3) ? 1 : type;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String sech) {
		this.search = sech;
	}
	public int getCweek() {
		return cweek;
	}
	public void setCweek(int cweek) {
		this.cweek=(type < 0 || type > 8) ? 1 : cweek;
	}
	

	public int getEvent() {
		return event;
	}
	public void setEvent(int event) {
		this.event = (event < 0 || event > 2) ? 0 : event;
	}

	public String getNotice() {
		return notice;
	}
	public void setNotice(String notice) {
		this.notice = notice;
	}

	@Override
	public String toString() {
		return "Criteria [page=" + page + ", perPageNum=" + perPageNum + ", type=" + type + ", cweek=" + cweek
				+ ", search=" + search + ", event=" + event + ", notice=" + notice + ", genre=" + genre + "]";
	}

	/* 쿼리문에서 limit에 사용되는 인덱스를 계산하는 getter */
	public int getStartPage() {
		return (page -1) * perPageNum;
	}

}
