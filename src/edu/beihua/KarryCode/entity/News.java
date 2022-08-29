package edu.beihua.KarryCode.entity;

public class News {
	private String news;
	private String time;
	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}
	
	public News() {
		super();
	}
	
	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public News(String news) {
		super();
		this.setNews(news);
	}

	public News(String news, String time) {
		super();
		this.setNews(news);
		this.setTime(time);
	}
	
}
