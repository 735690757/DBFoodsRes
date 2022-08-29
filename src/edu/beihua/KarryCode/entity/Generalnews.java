package edu.beihua.KarryCode.entity;

public class Generalnews extends News{
	private String General;

	public String getGeneral() {
		return General;
	}

	public void setGeneral(String general) {
		try{
			if(general.equals("普通")){
				this.General = general;
			}else{
				this.General = "未知";
				throw new Exception("普通等级设置有误，暂定为未知等级。");
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public Generalnews(String news, String time,String general) {
		super(news,time);
		this.setGeneral(general);
	}
	
}
