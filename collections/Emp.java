package collections;
//			COMPARABLE EMPLOYEE CLASS
public class Emp implements Comparable<Emp>{
	private int empID;
	private String name;
	
	public Emp(int empID, String name) {
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
	@Override
	public int compareTo(Emp o) {
		if (this.empID<o.empID) {
			return 0;
		}
		else if(this.empID>o.empID){
			return 1;
		}
		else{
		return -1;
		}
	}
	
	}
