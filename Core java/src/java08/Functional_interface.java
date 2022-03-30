package java08;
import java.util.Arrays;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Functional_interface {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(15,30,45) ;
		
		Function<Integer,Integer>funref=(Integer i)->{ {
			return i*2;
		}

	};
     Stream s=list.stream();
     Stream s1=s.map(funref);
	 s1.forEach(System.out::println);
	 
	        //or
	
	list.stream().map(funref).forEach(System.out::println);
	
	
	
	}
}