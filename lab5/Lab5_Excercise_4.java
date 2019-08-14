package lab5;
public class Lab5_Excercise_4 {
	public static void main(String[] args) {
		try{
			String firstName,lastName;
			firstName=args[0];
			lastName=args[1];
			if(firstName==null&&lastName==null) 
			{
				throw new Myexception("Enter full name");
			}
			else{
				System.out.println("no exception occured");
				System.out.println(firstName);
				System.out.println(lastName);
			}
		}
		catch(Myexception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

}
