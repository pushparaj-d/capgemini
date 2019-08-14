package lab3;

public class Lab3_Excercise_4 {
	public static void calcPresent(char[] c)
	{
		int count=0;
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
				}
				
			
			}
			System.out.println(c[i]+"\tpresent\t"+count+"\ttimes...");
			count=0;
		}
	}

	public static void main(String[] args) {
	char[] c={'a','a','b','b','b','c','c','d'};
	calcPresent(c);
}
}
