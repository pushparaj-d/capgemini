package lab2;

public class Video extends MediaItem{
	// private data for director, genre and year released
	private String Director;
	private String Genre;
	private int YearReleased;
	public Video() {
	
	}
	public Video(int uniqueId, String title, int noOfCopy,int dataForRuntime,String Director,String Genre,int YearReleased){
		super(uniqueId,  title,noOfCopy, dataForRuntime);
		//setter
		setDirector( Director);
		setGenre( Genre);
		setYearReleased( YearReleased);
	}
	public void setDirector(String director) {
		Director = director;
	}
	public String getDirector() {
		return Director;
	}
	public void setGenre(String genre) {
		Genre = genre;
	}
	public String getGenre() {
		return Genre;
	}
	public void setYearReleased(int yearReleased) {
		YearReleased = yearReleased;
	}
	public int getYearReleased() {
		return YearReleased;
	}
	@Override
	public int addItem(int x) {
		int no = getNoOfCopy();
		return no += x;
	}
	//,SString Genre,int YearReleased)
	@Override
	public void print() {
		System.out.println("\t\tVIDEO DETAILS");
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("Unique Id of Video="+ getUniqueId());
		System.out.println("Video Title="+getTitle());
		System.out.println("Number Of Copy="+getNoOfCopy());
		System.out.println("Year Release of Video="+getYearReleased());
		System.out.println("Data for Runtime="+getDataForRuntime());
		System.out.println("Director of Video="+getDirector());
		System.out.println("Genre of Video="+getGenre());
		System.out.println("Checking in New Video="+"  "+ checkIn());
		System.out.println("Checking Out Video="+"   "+ checkOut());
		System.out.println("------*------*------*------*------*------*------*------*------*------");
		System.out.println("");
	}
	//int dataForRuntime,String Director,
	@Override
	public String checkIn() {
		return "Inside checkIn";
	}

	@Override
	public String checkOut() {
		return "Check in for some Book";
	}
	
	}
	

