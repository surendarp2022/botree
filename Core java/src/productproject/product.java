package productproject;

public class product {
	
	
		int productprice;
		int productid;
		int productstock;
		String productname;
		public product(int productprice, int productid, int productstock, String productname) {
			super();
			this.productprice = productprice;
			this.productid = productid;
			this.productstock = productstock;
			this.productname = productname;
		}
		
		
		@Override
		public String toString()
		{
			return "Product [productprice=" + productprice + ", productid=" + productid + ", productstock=" + productstock
					+ ", productname=" + productname + "]";
		}

}
