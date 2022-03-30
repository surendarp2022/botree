package Myspring;

public class Book {
	int bid;
	String bname;
	float price;
    
	  
	public int getbid() {
		return bid;
	}
	public void setbid(int bid) {
		  this.bid= bid;
	  }
	public String getbname() {
		return bname;
	}
	
    
    public void setbname(String bname) {
  	  this.bname= bname; 
    }
    public float getprice() {
		return price;
	}
    public void setprice(float price){
  	  this.price= price;   
	  }
    
    
    
    
    @Override
	public String toString() {
		return "book [bid=" + bid + ", bname=" + bname + ", price=" + price + "]";
	}

}
