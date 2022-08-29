package edu.beihua.KarryCode.dao.impl;
import java.util.ArrayList;
import java.util.List;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

import java.io.*;
import edu.beihua.KarryCode.dao.ICustomerDao;
import edu.beihua.KarryCode.entity.Customer;
import edu.beihua.KarryCode.entity.UserInfo;

public class CustomerDaoImpl implements ICustomerDao{
	
	public List<Customer> query() {
		List<Customer> list = new ArrayList<Customer>();
		
		try{
			Workbook wb = Workbook.getWorkbook(new File("D://DBFoodWeb.xls"));
			Sheet sheet = wb.getSheet("Customer");
			System.out.println(sheet.getRows());
			for(int i=0;i<sheet.getRows();i++){
				String userid = sheet.getCell(0,i).getContents();
				String userpass = sheet.getCell(3,i).getContents();
				Customer C = new Customer(userid,userpass);
				list.add(C);
			}
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return list;
	}
	
	@SuppressWarnings("unused")
	public boolean add(String username,String userpass,String userEmil){
		try{
			InputStream inStream = new FileInputStream("D://DBFoodWeb.xls");
			Workbook wb = Workbook.getWorkbook(inStream);
			jxl.write.WritableWorkbook wbe = Workbook.createWorkbook(new File("D://DBFoodWeb.xls"), wb);
			WritableSheet sheet = wbe.getSheet("Customer");

			Label label0=new Label(0, sheet.getRows(),username);
			Label label1=new Label(3, sheet.getRows(),userpass);
			Label label2=new Label(4, sheet.getRows(),userEmil);
			System.out.println(sheet.getRows());
			sheet.addCell(label0);
			sheet.addCell(label1);
			sheet.addCell(label2);
			wbe.write();
			wbe.close();
			wb.close();
			inStream.close();
			return true;
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return false;
	}
	public int deleCustermer() {
		return 0;
	}

	public int insertCustermer(Customer C) {
		return 0;
	}

	public int updateCustermer(Customer C) {
		return 0;
	}


	
	

}
