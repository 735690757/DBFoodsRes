package edu.beihua.KarryCode.entity;

public class PassException extends Exception{
	public PassException(){
		super("�������Ϊ��λ");
	}
	public PassException(String message){
		super(message);
	}
}
