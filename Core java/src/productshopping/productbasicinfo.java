package productshopping;

public class productbasicinfo {
	   
	  String product_name;
	  String product_id;
	  int product_price;
	  int product_size;
	  float product_rating;
	  
	  public productbasicinfo() {
		  
		  
	  }
	  public String getproduct_name() {
		  return product_name;
	  }
	  public void setproduct_name(String product_name) {
		  this.product_name= product_name;
	  }
      public String getproduct_id() {
		  return product_id;
	  }
      public void setproduct_id(String product_id){
    	  this.product_id= product_id; 
      }
      public int getproduct_price() {
		  return product_price;
		  
	  }
      public void setproduct_price(int product_price){
    	  this.product_price= product_price;   
	  }
      public int getproduct_size() {
    	  return product_size;
      }
      public void setproduct_size(int product_size) {
    	  this.product_size= product_size;
      }
      public float getproduct_rasting() {
    	  return product_rating;
      }
      public void setproduct_rating(float product_rating) {
    	  this.product_rating= product_rating;
      }
}
