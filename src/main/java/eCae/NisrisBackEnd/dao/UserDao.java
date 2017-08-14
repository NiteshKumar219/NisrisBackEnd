package eCae.NisrisBackEnd.dao;

import java.util.ArrayList;

import eCae.NisrisBackEnd.model.Customer;

public interface UserDao {
	boolean addCustomer(Customer c);
	ArrayList<Customer> getAllCustomers();
}
