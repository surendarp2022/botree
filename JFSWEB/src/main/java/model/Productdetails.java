package model;

public class Productdetails {
	private int pid;
	private String pname;
	  private  float price;
	  private  int offer;
	  
	public Productdetails(String pname, int pid, float price, int offer) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.offer = offer;
	}

	
	  
	  
	  public Productdetails() {
		  
		  
	  }
	  public Productdetails(int pid, String pname, float price, int offer) {
		// TODO Auto-generated constructor stub
	}
	public int getpid() {
		  return pid;
	  }
	  public void setpid(int pid) {
		  this.pid= pid;
	  }
    public String getpname() {
		  return pname;
	  }
    public void setpid(String pname) {
  	  this.pname= pname; 
    }
    public float getprice() {
		  return price;
		  
	  }
    public void setprice(float price){
  	  this.price= price;   
	  }
    public int getoffer() {
  	  return offer;
    }
    public void setproduct_size(int offer) {
  	  this.offer= offer;
    }
    
    @Override
	public String toString() {
		return "Productdetails [pid=" + pid + ", pname=" + pname + ", price=" + price + ", offer=" + offer + "]";
	}

    
}
