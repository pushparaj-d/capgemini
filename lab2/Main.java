package lab2;


public class Main{

	public static void main(String[] args) {
		Book b1 = new Book();
		b1 = new Book(23, "HARRY POTTER", 12, "JK ROWLING");
		b1.print();
		JournalPaper j1 = new JournalPaper(23, "HARRY POTTER", 12, "JK ROWLING");
		j1.print();
		Video v1 = new Video();
		v1 = new Video(121, "BASIC JAVA VIDEO", 10, 15, "KUMARAVEL", "EDUCATION", 2013);
		v1.print();
		CD c1 = new CD(143, "FUNNY FAILS", 25, 10, "NO DIRECTOR", "COMEDY");
		c1.print();
	}

}

