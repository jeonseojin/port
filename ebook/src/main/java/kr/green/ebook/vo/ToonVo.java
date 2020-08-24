package kr.green.ebook.vo;

public class ToonVo {
	private int t_num;
	private String title;
	private String artist;
	private String plot;
	private int choice;
	private int like;
	private String t_img;
	private int g_code;
	private String lastEpisode;
	
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
	public String getartist() {
		return artist;
	}
	public void setartist(String artist) {
		this.artist = artist;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public int getchoice() {
		return choice;
	}
	public void setchoice(int choice) {
		this.choice = choice;
	}
	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}
	public String getT_img() {
		return t_img;
	}
	public void setT_img(String t_img) {
		this.t_img = t_img;
	}
	public int getg_code() {
		return g_code;
	}
	public void setg_code(int g_code) {
		this.g_code = g_code;
	}
	public String getLastEpisode() {
		return lastEpisode;
	}
	public void setLastEpisode(String lastEpisode) {
		this.lastEpisode = lastEpisode;
	}
	@Override
	public String toString() {
		return "ToonVo [t_num=" + t_num + ", title=" + title + ", artist=" + artist + ", plot=" + plot + ", choice="
				+ choice + ", like=" + like + ", t_img=" + t_img + ", g_code=" + g_code + ", lastEpisode=" + lastEpisode + "]";
	}
	
	
}
