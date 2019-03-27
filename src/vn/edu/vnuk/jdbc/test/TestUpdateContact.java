package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Scanner;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestUpdateContact {

	public static void main(String[] args) throws SQLException{
		ContactDao contactDao = new ContactDao();
		
		long id;
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Input id you want to update: ");
		id = sc.nextLong();
		
		Contact newContact = contactDao.read(id);
		
		newContact.setName("UpdatedName");
		newContact.setEmail("UpdatedEmail@Asd");
//		newContact.setAddress("asdasd");
		
		contactDao.update(id, newContact);
		
	}

}
