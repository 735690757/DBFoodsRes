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
			if(this.userSex == "男"||this.userSex == "女"){
				this.userSex = userSex;
			}else{
				throw new Exception("指定内容必须为男或者女");
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
				throw new Exception("用户名必须大于1位且不超过7位");
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
				System.out.println("当前密码长度:"+userPass.length());
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
