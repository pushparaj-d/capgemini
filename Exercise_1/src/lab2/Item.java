package lab2;
public abstract class Item {
	private String title;
	private int Number_of_Copies;
	private int Identification_Number;
	/*public  Item(String title,int Number_of_Copies,int Identification_Number) {
	super();
	}*/

	@Override
	public String toString() {
		return "Item [title=" + title + ", Number_of_Copies=" + Number_of_Copies + ", Identification_Number="
				+ Identification_Number + "]";
	}

	public String getTitle() {
		return title;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumber_of_Copies() {
		return Number_of_Copies;
	}

	public void setNumber_of_Copies(int number_of_Copies) {
		Number_of_Copies = number_of_Copies;
	}

	public int getIdentification_Number() {
		return Identification_Number;
	}

	public void setIdentification_Number(int identification_Number) {
		Identification_Number = identification_Number;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (Identification_Number != other.Identification_Number)
			return false;
		if (Number_of_Copies != other.Number_of_Copies)
			return false;
		if (title != other.title)
			return false;
		return true;
	}
	public void checkIn() {
	}

	public void checkOut() {

	}

	public void addItem() {

	}
	public static void main(String[] args) {
		
	}

}
