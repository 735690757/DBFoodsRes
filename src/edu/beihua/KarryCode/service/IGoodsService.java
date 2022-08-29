package edu.beihua.KarryCode.service;

import java.util.List;

import edu.beihua.KarryCode.entity.Goods;

public interface IGoodsService {
	List<Goods> getgoodsinfoAll(); 
	int instertGoods(Goods G1);
	int updateGoods(Goods G1);
	int deleGods(Goods G1);
}
