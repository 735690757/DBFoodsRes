package edu.beihua.KarryCode.dao;
import java.util.List;

import edu.beihua.KarryCode.entity.Customer;
public interface ICustomerDao {
	int updateCustermer(Customer C);
	int deleCustermer();
	List<Customer> query();

	
}
