package collections;

import java.util.Comparator;

public class Emp_comparator implements Comparator<Emp_comparator> {
		private int empID;
		private String name;
		
		public Emp_comparator(int empID, String name) {
			super();
			this.empID = empID;
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "\n[empID=" + empID + ", name=" + name + "]";
		}

		public int getEmpID() {
			return empID;
		}
		public String getName() {
			return name;
		}
		public int compareto(Emp_comparator e1,Emp_comparator e2)
		{
			if(e1.empID<e2.empID){
				return 1;
			}
			else if(e1.empID>e2.empID){
				return 0;
			}
			else {
				return 0;
			}
		}
		public int compareto(Emp_comparator o) {
			if (this.empID<o.empID) {
				return -1;
			}
			else if(this.empID>o.empID){
				return 1;
			}
			else{
			return 0;
			}
		}

		@Override
		public int compare(Emp_comparator o1, Emp_comparator o2) {
			// TODO Auto-generated method stub
			return 0;
		}
		
	

}
