package com.ey.day13;

import java.util.List;

public class ProductUI {

	public static void main(String[] args) throws Exception {
		ProductService ps=new ProductService();
		Product p=new Product(1,"Mouse","ey@gds");
		Product p1=new Product(2,"printer","ny@gds");
		Product p2=new Product(3,"speaker","by@gds");
		
		//System.out.println(p);
		//ps.addProduct(p1);
		//ps.addProduct(p2);
		//ps.UpdateProduct(1,"Bench");
		//ps.DeleteProduct(1);
		System.out.println("Listed Single Product");
	    System.out.println(ps.getOneProduct(2));
		/*
		 * List<Product> list=ps.getAllProducts(); list.forEach(System.out::println);
		 */
		
	}

}