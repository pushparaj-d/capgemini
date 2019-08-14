package lab2;

public class JournalPaper extends WrittenItem {
	private int PublishedYear;
	
	public JournalPaper(){
		
	}
	public JournalPaper(int uniqueId, String title, int noOfCopy,String author){
		super(uniqueId,title, noOfCopy,author);
		
	}
	
	
	public int getPublishedYear() {
		return PublishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		PublishedYear = publishedYear;
	}
	@Override
	public int addItem(int x) {
		int no = getNoOfCopy();
		return no += x;
	}

	@Override
	public String checkIn() {
		return "WrittenItem [getAuthor()=" + getAuthor() + ", getUniqueId()=" + getUniqueId() + ", getTitle()="
				+ getTitle() + ", getNoOfCopy()=" + getNoOfCopy() + "]";
	}

	@Override
	public String checkOut() {
		return "Check in for some Book";
	}
	@Override
	public void print() {
		System.out.println("\t\tJOURNAL PAPER DETAILS");
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("Unique Id="+ getUniqueId());
		System.out.println("Journal Paper Title="+getTitle());
		System.out.println("Number Of Journal Paper="+getNoOfCopy());
		System.out.println("Author of Journal Paper="+getAuthor());
		System.out.println("Checking in New Journal Paper="+"  "+ checkIn());
		System.out.println("Checking Out Journal Paper="+"   "+ checkOut());
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("");
	}
	

}

