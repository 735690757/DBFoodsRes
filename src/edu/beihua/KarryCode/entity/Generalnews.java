package edu.beihua.KarryCode.entity;

public class Generalnews extends News{
	private String General;

	public String getGeneral() {
		return General;
	}

	public void setGeneral(String general) {
		try{
			if(general.equals("��ͨ")){
				this.General = general;
			}else{
				this.General = "δ֪";
				throw new Exception("��ͨ�ȼ����������ݶ�Ϊδ֪�ȼ���");
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
