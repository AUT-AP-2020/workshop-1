




public class Music {
	
	private String address, singer;
	private int year;
	
	/**
	 * Create a new Music instance
	 * @param address Address of track file
	 * @param singer Track Singer
	 * @param year Publish Year
	 */
	Music(String address, String singer, int year) {
		setAddress(address);
		setSinger(singer);
		setYear(year);
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void print() {
		System.out.println(address+": "+singer+" - "+year);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Music)) return false;
		Music tmp = (Music) obj;
		return this.address.equals(tmp.address) && this.singer.equals(tmp.singer) && this.year==tmp.year;
	}

}
