package kr.green.ebook.vo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ToonVo {
	private int t_num;
	private String title;
	private String artist;
	private String plot;
	private int choice;
	private int up;
	private String t_img;
	private String g_code;
	private String lastEpisode;
	private Date t_date;
	private String t_week;
	private String t_title;
	private int t_views;
	
	public String getT_title() {
		return t_title;
	}
	public void setT_title(String t_title) {
		this.t_title = t_title;
	}
	public String getT_week() {
		return t_week;
	}
	public void setT_week(String t_week) {
		this.t_week = t_week;
	}
	public int getT_num() {
		return t_num;
	}
	public void setT_num(int t_num) {
		this.t_num = t_num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public String getT_img() {
		return t_img;
	}
	public void setT_img(String t_img) {
		this.t_img = t_img;
	}
	public String getG_code() {
		return g_code;
	}
	public void setG_code(String g_code) {
		this.g_code = g_code;
	}
	public String getLastEpisode() {
		return lastEpisode;
	}
	public void setLastEpisode(String lastEpisode) {
		this.lastEpisode = lastEpisode;
	}
	public String getT_date() {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		return transFormat.format(t_date);
	}
	public void setT_date(Date t_date) {
		this.t_date = t_date;
	}
	public void setT_date(String t_date) {
		SimpleDateFormat transFormat = new SimpleDateFormat("yyyy-MM-dd");
		try {
			this.t_date = transFormat.parse(t_date);
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public int getViews() {
		return t_views;
	}
	public void setViews(int t_views) {
		this.t_views = t_views;
	}
	@Override
	public String toString() {
		return "ToonVo [t_num=" + t_num + ", title=" + title + ", artist=" + artist + ", plot=" + plot + ", choice="
				+ choice + ", up=" + up + ", t_img=" + t_img + ", g_code=" + g_code + ", lastEpisode=" + lastEpisode
				+ ", t_date=" + t_date + ", t_week=" + t_week + ", t_title=" + t_title + ", t_views=" + t_views + "]";
	}

	
}
