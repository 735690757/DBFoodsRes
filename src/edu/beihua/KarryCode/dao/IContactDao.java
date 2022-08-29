package edu.beihua.KarryCode.dao;

import edu.beihua.KarryCode.entity.Contact;

public interface IContactDao {
	int insertContact(Contact A);
	int delContanct(Contact A);
	int updateContanct(Contact A);
}
