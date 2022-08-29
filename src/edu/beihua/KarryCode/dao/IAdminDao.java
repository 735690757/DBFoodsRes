package edu.beihua.KarryCode.dao;
import java.util.List;

import edu.beihua.KarryCode.entity.Admin;
public interface IAdminDao {
	int insterAdmin(Admin A);
	int updateAdmin(Admin A);
	int deleAdmin(Admin A);
	List<Admin> GetAdminALL();
	Admin GetAdminByName(Admin Name);
	Admin GetAdminByID(Admin C);
	
}
