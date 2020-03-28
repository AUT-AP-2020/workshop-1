package myPack;

/**
 * music class stores address and singer and the
 * release year of a music and it had getter methods
 * and a print method
 */
public class Music{

    private String address;
    private String singer;
    private int relYear;

    //Constructor
    public Music(String address, String singer, int relYear){
        this.address = address;
        this.singer = singer;
        this.relYear = relYear;
    }

    /**
     *
     * @return Address as a string
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return singer name as a string
     */
    public String getSinger() {
        return singer;
    }

    /**
     *
     * @return release year as an integer
     */
    public int getRelYear() {
        return relYear;
    }

    public void print(){
        System.out.println("Address: " + address);
        System.out.println("Singer: " + singer + " | Release Year: " + relYear);
    }
}