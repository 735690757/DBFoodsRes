package edu.beihua.KarryCode.entity;

public class Goods {
	private String GId;
	private String GName;
	private float Gprice;
	private String GIntroduce;
	private int GLike;
	public String getGId() {
		return GId;
	}
	public void setGId(String gId) {
		GId = gId;
	}
	public String getGName() {
		return GName;
	}
	public void setGName(String gName) {
		GName = gName;
	}
	public float getGprice() {
		return Gprice;
	}
	public void setGprice(float gprice) {
		try{
			if(Gprice>=0){
				Gprice = gprice;
			}else{
				throw new Exception("价格有误，价格小于0");
			}
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}
	public String getGIntroduce() {
		return GIntroduce;
	}
	public void setGIntroduce(String gIntroduce) {
		GIntroduce = gIntroduce;
	}
	public int getGLike() {
		return GLike;
	}
	public void setGLike(int gLike) {
		GLike = gLike;
	}
	
	public Goods(String gName, float gprice, String gIntroduce) {
		super();
		GName = gName;
		Gprice = gprice;
		GIntroduce = gIntroduce;
	}
	public Goods(String gName, float gprice, String gIntroduce, int gLike) {
		super();
		GName = gName;
		Gprice = gprice;
		GIntroduce = gIntroduce;
		GLike = gLike;
	}
	public Goods(String gID,String gName, float gprice, String gIntroduce, int gLike) {
		super();
		GId = gID;
		GName = gName;
		Gprice = gprice;
		GIntroduce = gIntroduce;
		GLike = gLike;
	}
	
	
	public void Like(){
		this.GLike++;
	}
	
	public int ChangePrice(float NewPrice){
		if(NewPrice>=0){
			this.setGprice(NewPrice);
			return 1;
		}
		else{
			return -1;
		}
	}
	public int ChangeName(String NewName){
		if(NewName.length()<15){
			this.setGName(NewName);
			return 1;
		}
		else{
			return -1;
		}
	}
	public void ChangeIntroduce(String NewIntroduce){
		this.setGIntroduce(NewIntroduce);
	}
	
	
}
