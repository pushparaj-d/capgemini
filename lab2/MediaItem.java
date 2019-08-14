package lab2;

public abstract class MediaItem extends Item {
	private int dataForRuntime;
	
	public MediaItem(){
		
	}
	
	public MediaItem(int uniqueId, String title, int noOfCopy,int dataForRuntime){
		super(uniqueId, title, noOfCopy);
		setDataForRuntime(dataForRuntime);
	}

	public int getDataForRuntime() {
		return dataForRuntime;
	}

	public void setDataForRuntime(int dataForRuntime) {
		this.dataForRuntime = dataForRuntime;
	}

	@Override
	public String toString() {
		return "MediaItem [getDataForRuntime()=" + getDataForRuntime() + ", getUniqueId()=" + getUniqueId()
				+ ", getTitle()=" + getTitle() + ", getNoOfCopy()=" + getNoOfCopy() + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaItem other = (MediaItem) obj;
		if (dataForRuntime != other.dataForRuntime)
			return false;
		return true;
	}
	
	

}

