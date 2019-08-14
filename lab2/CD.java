package lab2;

public class CD extends MediaItem{
	// added private data for artist and genre
	private String Artist;
	private String genre;
	public CD(){
		
	}
	public CD(int uniqueId, String title, int noOfCopy,int dataForRuntime,String Artist,String genre){
		super( uniqueId,title, noOfCopy,dataForRuntime);
		setArtist(Artist);
		setGenre(genre);
	}
	
	public String getArtist() {
		return Artist;
	}
	public void setArtist(String artist) {
		Artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	@Override
	public int addItem(int x) {
		int no = getNoOfCopy();
		return no += x;
	}

	@Override
	public void print() {
		System.out.println("\t\tCD DETAILS");
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("Unique Id of CD="+ getUniqueId());
		System.out.println("CD Title="+getTitle());
		System.out.println("Number Of Copy ="+getNoOfCopy());
		System.out.println("Artist of CD="+getArtist());
		System.out.println("Data for Runtime="+getDataForRuntime());
		System.out.println("Genre of CD="+getGenre());
		System.out.println("Checking in New CD="+"  "+ checkIn());
		System.out.println("Checking Out CD="+"   "+ checkOut());
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("");
	}
	//int dataForRuntime,String Director,
	@Override
	public String checkIn() {
		return "WrittenItem [ getUniqueId()=" + getUniqueId() + ", getTitle()="
				+ getTitle() + ", getNoOfCopy()=" + getNoOfCopy() ;
	}

	@Override
	public String checkOut() {
		return "Check in for some Book";
	}
	
	}
	

