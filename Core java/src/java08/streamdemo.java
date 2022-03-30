package java08;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streamdemo {

	
	
	public static List<String> convertArrayToList(String array[]){
	
	return Arrays.stream(array).collect(
			Collectors.toList());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		
		//create an array
		int array[]
				= {100,200,300,500};
		// print the array
		System.out.println("Array:"+Arrays.toString(array));
		
		
		// convert the array to list using stream
		//List<String> list= convertArrayToList(array);
		
		//using asList function
		List l=Arrays.asList(array);
		List<Integer> list=new ArrayList<Integer>();
		 list.add(20);
		 list.add(15);
		 list.add(25);
		
		
		
		//l.stream().map(i->i*3).forEach(System.out::println);
	 // List s= list.stream().map(i->i*3).collect(Collectors.toList());
	//	System.out.println("List:" + s);
		
		List<String> stringlist=new ArrayList<String>();
		stringlist.add("welcome");
		stringlist.add("back");
		
		  List sl= stringlist.stream().filter(S->S.startsWith("w")).collect(Collectors.toList());
		List sl1= stringlist.stream().filter(S-> S.matches("welcome")).collect(Collectors.toList());
		  List sl2= stringlist.stream().filter(S->S.contains("back")).collect(Collectors.toList());
		  System.out.println("List:" + sl);
		  System.out.println("List:" + sl1);
		  System.out.println("List:" + sl2);
	      System.out.println("List:" + stringlist);
		  
		
	
		
		
		
		
	}

}
