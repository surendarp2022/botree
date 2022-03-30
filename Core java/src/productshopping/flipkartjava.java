package productshopping;

public class flipkartjava extends productbasicinfo {
    void item_search() {
    	if(product_price>1000) { 
    		System.out.println("50% discount available");
    	}
    	else if(product_price==550) {
    		System.out.println("25% discount available");
    	}
    	else;
    		System.out.println("no discount available");
    }
}

