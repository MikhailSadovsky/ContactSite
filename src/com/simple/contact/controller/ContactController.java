package com.simple.contact.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simple.contact.entity.Contact;
import com.simple.contact.exception.ServiceException;
import com.simple.contact.service.IContactService;
import com.simple.contact.service.impl.ContactService;

public class ContactController extends HttpServlet {

	private static final long serialVersionUID = 4337315629536853275L;

	private IContactService contactService = new ContactService();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		try {
			List<Contact> contacts = contactService.loadAll();
			req.setAttribute("contacts", contacts);
			req.getRequestDispatcher("WEB-INF/jsp/contacts.jsp").forward(req,
					resp);
		} catch (ServiceException e) {
			req.setAttribute("errorMessage", e.getMessage());
			req.getRequestDispatcher("WEB-INF/jsp/error.jsp")
					.forward(req, resp);
		}
	}

}
