package edu.beihua.KarryCode.entity;

public abstract class Contact{
	private String content;
	
	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		try{
			if(content.length()>=8){
				this.content = content;
			}else{
				throw new Exception("您输入的内容过短");
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public Contact(String content) {
		super();
		this.setContent(content);
	}

	public abstract String CNow();
}
