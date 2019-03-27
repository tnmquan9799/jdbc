package vn.edu.vnuk.jdbc.test;

import vn.edu.vnuk.jdbc.dao.ContactDao;
import vn.edu.vnuk.jdbc.model.Contact;

public class TestReadContact {

	public static void main(String[] args) {
		
		ContactDao contactDao = new ContactDao();
		Contact contact = new Contact();
		
		System.out.println(String.format("ID: %o", contact.getId()));
		System.out.println(String.format("Name: %s", contact.getName()));
		System.out.println(String.format("Email: %s", contact.getEmail()));
		System.out.println(String.format("Address: %s", contact.getAddress()));
		System.out.println(String.format("Date Of Register: %tD", contact.getDateOfRegister()));
	}

}
