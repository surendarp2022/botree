package Myspring;

import java.util.List;

public class Bookcollection {
      List booklist;
      public List getBookList() {
    	  return booklist;
      }
     public void setBookList(List bookList) {
    	 this.booklist = booklist;
     } 
    	 @Override
    		public String toString() {
    			return "Bookcollection[booklist=" + booklist +  "]";
    		}
     }
      
      

