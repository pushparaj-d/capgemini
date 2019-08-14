package lab2;

public abstract class Item {

	private int uniqueId;
	private String title;
	private int noOfCopy;

	public Item() {
		super();
		uniqueId = 0;
		title = null;
		noOfCopy = 0;

	}

	public Item(int uniqueId, String title, int noOfCopy) {
		super();
		//this.uniqueId = uniqueId;
		setUniqueId(uniqueId);
		//this.title = title;
		setTitle(title);
		//this.noOfCopy = noOfCopy;
		setNoOfCopy(noOfCopy);
	}

	public int getUniqueId() {

		return uniqueId;
	}

	public void setUniqueId(int uniqueId) {
		if (uniqueId > 0)
			this.uniqueId = uniqueId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNoOfCopy() {
		return noOfCopy;
	}

	public void setNoOfCopy(int noOfCopy) {
		this.noOfCopy = noOfCopy;
	}

	public abstract int addItem(int x);

	public abstract String checkIn();

	public abstract String checkOut();

	public abstract void print();

	@Override
	public String toString() {
		return "Lab2_Ex1_Item [uniqueId=" + getUniqueId()+ ", title=" + getTitle()  + ", noOfCopy=" + getNoOfCopy() + "]";
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
		if (noOfCopy != other.noOfCopy)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (uniqueId != other.uniqueId)
			return false;
		return true;
	}

}

