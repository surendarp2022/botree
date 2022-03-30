package Myspring;
import java.util.AbstractCollection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Driverclass {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanConfig.xml");
      
    //    BookStore bookStore=(BookStore)context.getBean("bookstore");
      // BookPublisher bookPublisher=(BookPublisher) context.getBean("bookstore");
      // Book book=(Book) context.getBean("book");
		Bookcollection bookcollection=(Bookcollection)context.getBean("bookcollection");
        System.out.println(bookcollection);
        
        
        
        
        
        
	}

}
