package lab2;

public class Book extends WrittenItem {
	
	public int BookNo=0;
	
			
	public Book() {
		super();
		
			}
	
	public Book(int uniqueId, String title, int noOfCopy,String author){
		super(uniqueId, title, noOfCopy,author);
		
	}
	
	
	@Override
	public int addItem(int x) {
		int no = getNoOfCopy();
		return no += x;
	}

	@Override
	public void print() {
		System.out.println("\t\tBOOK DETAILS");
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("Unique Id="+ getUniqueId());
		System.out.println("Book Title="+getTitle());
		System.out.println("Number Of Copy="+getNoOfCopy());
		System.out.println("Author of Book="+getAuthor());
		System.out.println("Checking in New Book="+"  "+ checkIn());
		System.out.println("Checking Out Book="+"   "+ checkOut());
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("");
		
		
	}

	@Override
	public String checkIn() {
		return "Inside CheckIn class";
	}

	@Override
	public String checkOut() {
		return "Check in for some Book";
	}

}

