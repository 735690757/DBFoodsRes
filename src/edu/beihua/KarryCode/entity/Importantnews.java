package edu.beihua.KarryCode.entity;

public class Importantnews extends News{
	private String Important;
	private int degree;
	public String getImportant() {
		return Important;
	}

	public void setImportant(String important) {
		try{
			if(important.equals("��Ҫ")||important.equals("����")){
				this.Important = important;
			}else{
				throw new Exception("�ȼ����������ݶ�Ϊδ֪�ȼ���");
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}
	
	public int getDegree() {
		return degree;
	}

	public void setDegree(int degree) {
		
		try{
			switch(degree){
			case 1:
				this.degree = 1;
				break;
			case 2:
				this.degree = 2;
				break;
			case 3:
				this.degree = 3;
				break;
			case 4:
				this.degree = 4;
				break;
			case 5:
				this.degree = 5;
				break;
			default:
				this.degree = 0;
				throw new Exception("�����̶�ƥ��ʧ��");
				
			}
		}catch(Exception ex){
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

	public Importantnews(String news, String time,String important,int degree) {
		super(news,time);
		this.setImportant(important);
		this.setDegree(degree);
	}
	
}
