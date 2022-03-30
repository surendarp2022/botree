package empproject;
import java.util.Scanner;

public class empobjinfo {

	public static void main(String[] args) {
		
		
		

				Scanner scanner=new Scanner(System.in);
				empinfo emp1=new empinfo();
				emp1.eid=1121;
				emp1.dept="QC";
				emp1.ename="SAI";
				emp1.salary=25000f;

				empinfo emp2=new empinfo("SURENDAR","N/W",20000f,2);
				empinfo emp3=new empinfo(3,"RAJ",30000f);
				emp3.dept="Analyst";

				System.out.println("Enter Emp4 eid:");
				int eid=scanner.nextInt();
				System.out.println("Enter Emp4 ename:");
				String ename =scanner.next();
				System.out.println("Enter Salary");
				float salary=scanner.nextFloat();

				empinfo emp4=new empinfo(eid,ename,salary);
				System.out.println(emp1);
				System.out.println(emp2);
				System.out.println(emp3);
		        System.out.println(emp4);

				


				
				scanner.close();
			}	
			public void show() {
				System.out.println("Im show inside employee");
			}

		

	}


