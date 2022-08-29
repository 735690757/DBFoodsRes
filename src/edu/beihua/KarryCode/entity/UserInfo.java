package edu.beihua.KarryCode.entity;

public class UserInfo {
	private String userName;
	private String userID;
	private String userSex;
	private String userPass;
	private String userEmail;
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) throws Exception {
		try{
			if(this.userSex == "��"||this.userSex == "Ů"){
				this.userSex = userSex;
			}else{
				throw new Exception("ָ�����ݱ���Ϊ�л���Ů");
			}
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) throws Exception {
		try{
			if(userName.length()<7&&userName.length()>1){
				this.userName = userName;
			}else{
				throw new Exception("�û����������1λ�Ҳ�����7λ");
			}
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) throws Exception {
		try{
			if((userPass.length())==6){
				this.userPass = userPass;
			}else{
				System.out.println("��ǰ���볤��:"+userPass.length());
				throw new PassException();
			}
		}catch(PassException ex){
			ex.printStackTrace();
		}
		
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	
	public UserInfo(){
	}
	public UserInfo(String userID, String userPass) throws Exception {
		super();
		this.setUserID(userID);
		this.setUserPass(userPass);
	}
	public UserInfo(String userName, String userPass, String userEmail) throws Exception {
		this.setUserName(userName);
		this.setUserPass(userPass);
		this.setUserEmail(userEmail);
		}
	public UserInfo(String userID, String userName, String userPass,String userSex,String userEmail) throws Exception {
		super();
		this.setUserName(userName);
		this.setUserID(userID);
		this.setUserSex(userSex);
		this.setUserPass(userPass);
		this.setUserEmail(userEmail);
	}
}
