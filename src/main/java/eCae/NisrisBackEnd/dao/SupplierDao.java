package eCae.NisrisBackEnd.dao;

import java.util.ArrayList;

import eCae.NisrisBackEnd.model.Supplier;

public interface SupplierDao {

	boolean addSupplier(Supplier s);
	ArrayList<Supplier>getAllsupplier();
}
