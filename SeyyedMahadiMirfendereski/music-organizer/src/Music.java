/**
 *
 * A class to hold details of music.
 * @author Mahdi Mir
 * @version 0.0
 */
public class Music {
    private String address ;
    private String artist ;
    private int year;

    /**
     *
     * @param address where is it?
     * @param artist who is singer
     * @param year released date
     */
    public Music(String address, String artist, int year) {
        this.address = address;
        this.artist = artist;
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    @Override
    public String toString() {
        return "Music{" +
                "address='" + address + '\'' +
                ", artist='" + artist + '\'' +
                ", year=" + year +
                '}';
    }
}
