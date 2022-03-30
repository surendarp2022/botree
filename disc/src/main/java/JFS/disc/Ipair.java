package JFS.disc;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity

public class Ipair {
	@Id
 
	
private int lid;
   private String brand;
   private int price;
   public Ipair(int lid, String brand, int price) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.price = price;
	}
public Ipair() {
		super();
		// TODO Auto-generated constructor stub
	}
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
@Override
public String toString() {
	return "Ipair [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
}
}
