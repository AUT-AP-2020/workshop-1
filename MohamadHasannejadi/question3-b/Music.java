


public class Music {
    private String address;
    private String singer;
    private int year;

    public Music (String address, String singer, int year){
        this.address = address;
        this.singer = singer;
        this.year = year;
    }

    /**
     * @return the year
     */
    public int getYear() {
        return year;
    }
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    /**
     * @return the singer
     */
    public String getSinger() {
        return singer;
    }
    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    /**
     * @param singer the singer to set
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }
    /**
     * @param year the year to set
     */
    public void setYear(int year) {
        this.year = year;
    }




}