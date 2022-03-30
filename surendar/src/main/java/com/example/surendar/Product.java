package com.example.surendar;

public class Product {
	private int pid;
	  private String pname;
  public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
  public Product(int pid,String pname) {
	  super();
	  this.pid=pid;
	  this.pname=pname;
	  
  }
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + "]";
}
  
  
}
