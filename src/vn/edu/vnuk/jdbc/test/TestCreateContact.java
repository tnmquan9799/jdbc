package vn.edu.vnuk.jdbc.test;

import java.sql.SQLException;
import java.util.Calendar;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestCreateContact {

	public static void main(String[] args) throws SQLException {

		Contact contact = new Contact();
		
		contact.setName("Minh Quan");
		contact.setEmail("asdcas@asd.com");
		contact.setAddress("123 Le Loi");
		contact.setDateOfRegister(Calendar.getInstance());
		
		
		new ContactDao().create(contact);
	}

}
