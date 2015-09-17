package com.simple.contact.service.impl;

import java.util.List;

import com.simple.contact.dao.IContactDao;
import com.simple.contact.dao.impl.ContactDao;
import com.simple.contact.entity.Contact;
import com.simple.contact.exception.DaoException;
import com.simple.contact.exception.ServiceException;
import com.simple.contact.service.IContactService;

public class ContactService implements IContactService {

	private IContactDao contactDao = new ContactDao();

	@Override
	public Long saveOrUpdate(Contact contact) throws ServiceException {
		Long id = 0L;
		try {
			if (null == contact.getId()) {
				id = contactDao.save(contact);
			} else {
				contactDao.update(contact);
				id = contact.getId();
			}
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
		return id;
	}

	@Override
	public List<Contact> loadAll() throws ServiceException {
		try {
			return contactDao.loadAll();
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

	@Override
	public Long getCount() throws ServiceException {
		try {
			return contactDao.getCount();
		} catch (DaoException e) {
			throw new ServiceException(e.getMessage(), e);
		}
	}

}
