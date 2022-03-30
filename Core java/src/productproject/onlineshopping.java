package productproject;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class onlineshopping {
	int[] srr=new int[4];
	@SuppressWarnings("unused")

	public static void main(String[] args) {
		String name =null;
		int id=0,price=0,stock=0;
     
       int t=0;
       
      Scanner s=new Scanner(System.in);
	int c;
	int k=0;
	List<product> arrList=new LinkedList<product>();
	arrList.add(new product(600,1,20,"android"));
	arrList.add(new product(500,2,20,"sumsung"));
	arrList.add(new product(400,3,20,"nokia"));
	arrList.add(new product(200,4,20,"realme"));
	do
	{
	System.out.println("what do you want to do"+'\n'+"1.buy"+'\n'+"2.sell"+'\n'+"3.close");
	c=s.nextInt();
	int z=0;
	int purchid;
	switch(c)
	{
	case 1:
		for(product i: arrList)
		{
			System.out.println(i);
		}
		System.out.println("enter the product id you wish to purchase");
		purchid=s.nextInt();
		System.out.println("can we process the order y/n");
		char u=s.next().charAt(0);
		if(u=='y')
		{
			System.out.println("enter your pass id");
			String passid=s.next();
			System.out.println("enter your atm pin");
			String atmpin=s.next();
			for(product i: arrList)
			{
				if(i.productid==purchid)
				{
					System.out.println("your order");
					System.out.println("product name:"+i.productname+'\n'+"productid"+i.productid+'\n'+"product price:"+i.productprice);
						System.out.println("Thankyou for ordering with us");
						i.productid--;
				}
				//System.out.println(i);
			}
		}
		break;
		
	case 2:
		do {
			System.out.println("choos action"+'\n'+"1.add product"+'\n'+"2.Remove product"+'\n'+"3.exit");
			int o=s.nextInt();
			switch(o)
			{
					case 1:
								System.out.println("Product Name:"+'\n');
								name=s.next();
								System.out.println("Productid:"+'\n');
								id=s.nextInt();
								System.out.println("Product price:"+'\n');
								price=s.nextInt();
								System.out.println("Product Stocks:"+'\n');
								stock=s.nextInt();
								arrList.add(new product(price,id,stock,name));
								break;
					case 2:
						System.out.println("enter the product id you want to delete");
						int y=s.nextInt();
						for(product i: arrList)
						{
							if(i.productid==y)
							{
								i.productstock=0;
							}
						}
					case 3:
						t=1;
						break;
							
						}
		}while(t==0);
	    break;
	case 3:
		k=1;
		break;
	}
	}while(k==0);
	
	s.close();

    }    


	}


