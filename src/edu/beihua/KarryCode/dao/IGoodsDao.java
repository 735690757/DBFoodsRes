package edu.beihua.KarryCode.dao;
import java.util.List;

import edu.beihua.KarryCode.entity.Goods;
public interface IGoodsDao {
	int insterGoods(Goods G1);
	int updateGoods(Goods G1);
	int deleGoods(Goods G1);
	List<Goods> GetGoodsInfoALL();
	Goods GetGoodsID(String ID);
	Goods GetGoodsName(String Name);
	Goods GetGoodsPrice(String Price);
	Goods GetGoodsLike(int Like);
}
