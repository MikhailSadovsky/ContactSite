package com.simple.contact.service;

import java.util.List;

import com.simple.contact.entity.Contact;
import com.simple.contact.exception.ServiceException;

public interface IContactService {

	Long saveOrUpdate(Contact contact) throws ServiceException;

	List<Contact> loadAll() throws ServiceException;

	Long getCount() throws ServiceException;
}
