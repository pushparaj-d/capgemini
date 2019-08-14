package lab2;

public abstract class WrittenItem extends Item {
	private String Author;
	public WrittenItem(){
		
	}
	
	public WrittenItem(int uniqueId, String title, int noOfCopy,String author ){
		super(uniqueId,title,noOfCopy);
		setAuthor(author); 	
		
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getAuthor() {
		return Author;
	}

	@Override
	public String toString() {
		return "WrittenItem [getAuthor()=" + getAuthor() + ", getUniqueId()=" + getUniqueId() + ", getTitle()="
				+ getTitle() + ", getNoOfCopy()=" + getNoOfCopy() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WrittenItem other = (WrittenItem) obj;
		if (Author == null) {
			if (other.Author != null)
				return false;
		} else if (!Author.equals(other.Author))
			return false;
		return true;
	}
	
	
	
	
}
