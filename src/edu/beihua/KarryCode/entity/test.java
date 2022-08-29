package edu.beihua.KarryCode.entity;
import java.util.Scanner;
public class test {
	public static void main(String[] args) throws Exception {
		//Scanner in = new Scanner(System.in);
		//UserInfo u1 = new UserInfo();
		//u1.setUserPass(in.next());
		
		
		
		
		
		/*
		File f1 = new File("D:\\AAA.txt");
		FileInputStream fis;
		FileOutputStream fos;
		FileReader fr;
		FileWriter fw;
		if (f1.exists()){
			System.out.println("文件存在！");
			System.out.println(f1.length());
			System.out.println(f1.lastModified());
			System.out.println(f1.getPath());
			System.out.println(f1.canRead());
		}else{
			try{
				f1.createNewFile();
				System.out.println("文件创建成功！");
			}catch(Exception ex){
				System.out.println(ex.getMessage());
			}
			
		}
		try{
			fw = new FileWriter(f1);
			String str = "我爱编码 我很抽象";
			char[] a  =str.toCharArray();//字符串转化为字符数组
			fw.write(a);
			fw.close();
		}catch(Exception ex){
			
		}
		try{
			StringBuffer result = new StringBuffer();//可变长度的字符串方法
			int n;
			fr = new FileReader(f1);
			char[] a  = new char[10];
			while((n = fr.read(a,0,10))!=-1){
				String temp = new String(a,0,10);
				result =result.append(temp);
			}
			fr.close();
			System.out.println(result);
		}catch(Exception ex){
			
		}
		*/
		
		/*
		try{
			fos = new FileOutputStream(f1);
			String str = "Life is a span.";
			byte[] buff = str.getBytes();//利用String类的方法将字符串转化为字节
			fos.write(buff);
		}catch(Exception ex){
			System.out.println("文件写错误！");
		}
		try{
			int n;
			byte a[] = new byte[100];
			fis =  new FileInputStream(f1);
			while((n = fis.read(a,0,100))!=-1){
				String s = new String (a,0,n);
				System.out.print(s);
				}
			fis.close();
		}catch(IOException ex){
			System.out.println("文件读错误");
		}
		*/
	}

}
