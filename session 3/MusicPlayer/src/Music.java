public class Music {
    private String address;
    private int year;
    private String singer;

    /**
     * Constructor for Music
     * @param address Address of file
     * @param year The year music produced
     * @param singer Singer's name
     */
    public Music(String address, int year, String singer) {
        this.address = address;
        this.year = year;
        this.singer = singer;
    }

    /**
     * Getter for address
     * @return Address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Stter for Address
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter for year
     * @return Year
     */
    public int getYear() {
        return year;
    }

    /**
     * Setter for year
     * @param year Year
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getter for singer
     * @return Singer's name
     */
    public String getSinger() {
        return singer;
    }

    /**
     * Setter for singer
     * @param singer Singer's name
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * Print details of a file
     */
    public void print(){
        System.out.println("Name: "+this.address+"Singer: "+this.singer+"Product year: "+this.year);
    }
}
