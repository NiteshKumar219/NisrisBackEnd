package eCae.NisrisBackEnd.dao;

import java.util.ArrayList;

import eCae.NisrisBackEnd.model.Product;

public interface ProductDao {
	boolean addProduct(Product productdao);
	ArrayList<Product>getAllProduct();

}
