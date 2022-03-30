package corejava;

class StudentData{
	int sid;
	String name;
	String dept;
	int mark;
	
	StudentData(int sid,String name,String dept,int mark){
		System.out.println(sid+name+dept+mark);
	}
	
	public void displayprofile() {
		System.out.println(sid+"\n"+name+"\n"+dept+mark);
	}
	
}



public class student {

	public static void main(String[] args) {
		
       StudentData lokesh=new StudentData(1,"lokesh","mech",100);
       
       
       
       lokesh.sid=1;
       lokesh.name="lokeshwaran";
       lokesh.dept="mech";
       lokesh.mark=100;
       
       lokesh.displayprofile();
	}

}
