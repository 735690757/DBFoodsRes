package edu.beihua.KarryCode.dao.impl;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;

import edu.beihua.KarryCode.dao.IGoodsDao;
import edu.beihua.KarryCode.dao.ILikeDao;
import edu.beihua.KarryCode.entity.Customer;
import edu.beihua.KarryCode.entity.Goods;
public class GoodsDaoImpl implements IGoodsDao{
	@SuppressWarnings("unused")
	public boolean add(String gID,String gName,String gPrice,String gIntroduce,String gLike){
		try{
			InputStream inStream = new FileInputStream("D://DBFoodWeb.xls");
			Workbook wb = Workbook.getWorkbook(inStream);
			jxl.write.WritableWorkbook wbe = Workbook.createWorkbook(new File("D://DBFoodWeb.xls"), wb);
			WritableSheet sheet = wbe.getSheet("Goods");

			Label label0=new Label(0, sheet.getRows(),gID);
			Label label1=new Label(1, sheet.getRows(),gName);
			Label label2=new Label(2, sheet.getRows(),gPrice);
			Label label3=new Label(3, sheet.getRows(),gIntroduce);
			Label label4=new Label(4, sheet.getRows(),gLike);
			System.out.println(sheet.getRows());
			sheet.addCell(label0);
			sheet.addCell(label1);
			sheet.addCell(label2);
			sheet.addCell(label3);
			sheet.addCell(label4);
			wbe.write();
			wbe.close();
			wb.close();
			inStream.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}

	public Goods GetGoodsID(String ID) {
		return null;
	}

	public List<Goods> GetGoodsInfoALL() {
		return null;
	}

	public Goods GetGoodsLike(int Like) {
		return null;
	}

	public Goods GetGoodsName(String Name) {
		return null;
	}

	public Goods GetGoodsPrice(String Price) {
		return null;
	}

	public int deleGoods(Goods G1) {
		return 0;
	}

	public int insterGoods(Goods G1) {
		return 0;
	}

	public int updateGoods(Goods G1) {
		return 0;
	}
}

