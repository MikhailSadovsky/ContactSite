package com.simple.contact.dao.impl;

import java.util.List;

import com.simple.contact.dao.IContactDao;
import com.simple.contact.entity.Contact;
import com.simple.contact.exception.DaoException;

public class ContactDao implements IContactDao {

	@Override
	public Long save(Contact contact) throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Contact contact) throws DaoException {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Contact> loadAll() throws DaoException {
		/*
		 * return CsvImporter.importCsv("C:/contacts.csv");
		 */
		throw new DaoException("Oh....Exception");
	}

	@Override
	public Long getCount() throws DaoException {
		// TODO Auto-generated method stub
		return null;
	}

}
