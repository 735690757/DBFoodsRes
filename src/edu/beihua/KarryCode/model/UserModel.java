package edu.beihua.KarryCode.model;

import java.io.File;
import java.io.IOException;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import edu.beihua.KarryCode.dao.impl.CustomerDaoImpl;
import edu.beihua.KarryCode.entity.Customer;

public class UserModel {
	public boolean login(String userid,String password){
		CustomerDaoImpl Ud = new CustomerDaoImpl();
		List<Customer> list = Ud.query();
		Workbook wb = null;
		try {
			wb = Workbook.getWorkbook(new File("D://DBFoodWeb.xls"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		Sheet sheet = wb.getSheet("Customer");
		System.out.println(sheet.getRows());
		for(int i=0;i<sheet.getRows();i++){
			Customer Cus = list.get(i);
			System.out.println(Cus.getUserID());
			try{
				if(Cus.getUserID().equals(userid) && Cus.getUserPass().equals(password)){
				return true;
				}
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
		}
		return false;
	}
	public boolean reg(String username,String userpass,String userEmil){
		CustomerDaoImpl cd = new CustomerDaoImpl();
		boolean result = cd.add(username, userpass,userEmil);
		return result;
	}
}
