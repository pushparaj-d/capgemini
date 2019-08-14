package collections;

import java.util.Comparator;

public class Compare_all implements Comparator<Emp_comparator>{
	public int compare_name(Emp_comparator e1,Emp_comparator e2)
	{
		if(e1.getEmpID()<e2.getEmpID()){
			return 1;
		}
		else if(e1.getEmpID()>e2.getEmpID()){
			
			return -1;
		}
		else {
			return 0;
		}
	}

	@Override
	public int compare(Emp_comparator o1, Emp_comparator o2) {
		if(o1.getEmpID()<o2.getEmpID()){
			return 1;
		}
		else if(o1.getEmpID()>o2.getEmpID()){
			
			return -1;
		}
		else {
			return 0;
		}
	}
}
