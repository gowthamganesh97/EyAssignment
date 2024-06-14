package com.ey.day13;

public class Product
{
		Integer id;
		String name;
		String email;
		public Product(Integer id,String name,String email) {
			super();
			this.id=id;
			this.name=name;
			this.email=email;
		}
		@Override
		public String toString() 
		{
			return "Product [id=" + id + ", name=" + name + ", email=" + email + "]";
		}
	

}
