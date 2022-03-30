package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class javademo {

	public static void isBlankExample() {
		String s1="\n\t            ";
		System.out.println(s1.isBlank());
	}
	
	public static void linesExample() {
		String s1="hi everyone\n welcome to my home"+"\n  how are you all";
		Stream<String> l=s1.lines();
		l.forEach(System.out::println);
		
	}
	 
	public static void repeatExample() {
		String s="*";
		System.out.println(s.repeat(25));
	}
	
	public static void StripExample() {
		String s="                 \t welcome\t back";
		System.out.println(s.strip());
	   System.out.println(s.stripTrailing());
	  System.out.println(s.stripLeading());
	  System.out.println("-------------------------------");
}
	
	public static void ListExample() {
		List<Integer>list=List.of(15,30,45) ;
		 List s= list.stream().map(i->i*3).collect(Collectors.toList());
		 list.stream().filter(x->x<45).reduce(0,(sum,i)->Integer.sum(sum,i));
			System.out.println("List:" + s);
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
	        isBlankExample();
	        linesExample();
	        repeatExample();
	        StripExample();
	        ListExample();
	
	
	
	
}
}