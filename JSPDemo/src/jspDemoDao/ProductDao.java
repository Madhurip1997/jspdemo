package jspDemoDao;

import java.util.ArrayList;

import JSPdemo.Product;

public interface ProductDao {
	boolean insert(Product p);
	boolean update(Product p);
	boolean delete(int id);
	ArrayList<Product> DisplayAll();
	Product getProduct(int id);
	

}
