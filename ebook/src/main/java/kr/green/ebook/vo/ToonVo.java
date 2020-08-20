package kr.green.ebook.vo;

public class ToonVo {
	private int t_num;
	private String title;
	private String autor;
	private String plot;
	private int choise;
	private int like;
	private String t_img;
	private int g_num;
	private int m_num;
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
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public int getChoise() {
		return choise;
	}
	public void setChoise(int choise) {
		this.choise = choise;
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
	public int getG_num() {
		return g_num;
	}
	public void setG_num(int g_num) {
		this.g_num = g_num;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getLastEpisode() {
		return lastEpisode;
	}
	public void setLastEpisode(String lastEpisode) {
		this.lastEpisode = lastEpisode;
	}
	@Override
	public String toString() {
		return "ToonVo [t_num=" + t_num + ", title=" + title + ", autor=" + autor + ", plot=" + plot + ", choise="
				+ choise + ", like=" + like + ", t_img=" + t_img + ", g_num=" + g_num + ", m_num=" + m_num
				+ ", lastEpisode=" + lastEpisode + "]";
	}
	
	
}
