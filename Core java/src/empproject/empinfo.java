package empproject;

public class empinfo {
	
		@Override
		public String toString() {
			return "EMPINFO [eid=" + eid + ", ename=" + ename + ", dept=" + dept + ", salary=" + salary + "]";
		}

		int eid;
		String ename;
		String dept;
		float salary;
		
		//Constructor overloading
		public empinfo() {		
			
		}	// constructor without any arguments
		
		public empinfo(int eid, String ename, String dept, float sal) { // constructor with 4 arguments 		
			this.eid=eid;
			this.ename=ename;
			this.dept=dept;
			this.salary=sal;
		}
		
		public empinfo(String ename, String dept, float sal,int eid) { // constructor with 4 arguments 		
			this.eid=eid;
			this.ename=ename;
			this.dept=dept;
			this.salary=sal;
		}
		
		public empinfo(int eid,String ename, float sal)// constructor with 3 arguments
		{
			this.eid=eid;
			this.ename=ename;
			this.salary=sal;
		}
		
		
	}


