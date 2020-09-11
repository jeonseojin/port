package kr.green.ebook.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommentVo {
	private int co_num;
	private String co_member;
	private String co_content;
	private Date co_date;
	private int co_up;
	private int co_down;
	public int getCo_num() {
		return co_num;
	}
	public void setCo_num(int co_num) {
		this.co_num = co_num;
	}
	public String getCo_member() {
		return co_member;
	}
	public void setCo_member(String co_member) {
		this.co_member = co_member;
	}
	public String getCo_content() {
		return co_content;
	}
	public void setCo_content(String co_content) {
		this.co_content = co_content;
	}
	public String getCo_date() {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		return transFormat.format(co_date);
	}
	public void setCo_date(String co_date) {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.co_date =transFormat.parse(co_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public void setCo_date(Date co_date) {
		this.co_date = co_date;
	}
	public int getCo_up() {
		return co_up;
	}
	public void setCo_up(int co_up) {
		this.co_up = co_up;
	}
	public int getCo_down() {
		return co_down;
	}
	public void setCo_down(int co_down) {
		this.co_down = co_down;
	}
	@Override
	public String toString() {
		return "CommentVo [co_num=" + co_num + ", co_member=" + co_member + ", co_content=" + co_content + ", co_date="
				+ co_date + ", co_up=" + co_up + ", co_down=" + co_down + "]";
	}

	
}
