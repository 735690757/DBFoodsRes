package edu.beihua.KarryCode.entity;

public class Admin extends UserInfo {
	private String Adminlevel;

	public String getAdminlevel() {
		return Adminlevel;
	}

	public void setAdminlevel(String adminlevel) {
		try{
			if(adminlevel=="ϵͳ����Ա"){
				this.Adminlevel = adminlevel;
			}
			else{
				throw new Exception("��Ա��ݴ���");
			}
		}catch(Exception ex){
			ex.getMessage();
		}
	}

	public Admin(String userID,String userName, String userPass, String userSex,String userEmail,
			String adminlevel) throws Exception {
		super(userID,userName, userPass,userSex, userEmail);
		this.setAdminlevel(adminlevel);
	}
	
}
