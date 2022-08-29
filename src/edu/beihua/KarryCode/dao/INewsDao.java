package edu.beihua.KarryCode.dao;
import java.util.List;

import edu.beihua.KarryCode.entity.*;
public interface INewsDao {
	int insertNews(News news);
	int deleteNews(News news);
	int updateNews(News news);
	List<News> getNewsinfoAll();
}
