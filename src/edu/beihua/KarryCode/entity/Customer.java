package edu.beihua.KarryCode.entity;


public class Customer extends UserInfo{
	private String Custermerlevel;

	public String getCustermerlevel() {
		return Custermerlevel;
	}

	public void setCustermerlevel(String custermerlevel) {
		try{
			if(custermerlevel=="普通会员"||custermerlevel=="VIP"){
			this.Custermerlevel = custermerlevel;
			}
			else{
				throw new Exception("用户身份异常！");
			}
		}catch(Exception ex){
			ex.getMessage();
		}
		
	}
	public Customer() throws Exception {
		super();
	}
	
	public Customer(String userID, String userPass) throws Exception {
		super(userID,userPass);
	}

	public Customer(String userID,String userName, String userPass, String userSex,String userEmail,
			String custermerlevel) throws Exception {
		super(userID,userName,userPass,userSex,userEmail);
		this.setCustermerlevel(custermerlevel);
	}


	
	
}
