/**
 * A class to hold details A music file.
 * @author Amirreza Hashemi
 * @version 1.0
 */
public class Music {
    // An address for music file.
    private String address;
    // A singer'sname for music file.
    private String singerName;
    // A release date for music file.

    private String releaseYear;

    /**
     * create a new Music file wit given address,singer's name
     *and release year.
     * @param address     the address
     * @param singerName  the singer name
     * @param releaseYear the release year
     */
    public Music(String address, String singerName, String releaseYear) {
        this.address = address;
        this.singerName = singerName;
        this.releaseYear = releaseYear;
    }

    /**
     * Gets address of music file.
     *
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets address of music file .
     *
     * @param address the address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Gets singer's name of music file.
     *
     * @return the singer name
     */
    public String getSingerName() {
        return singerName;
    }

    /**
     * Sets singer's name of music file.
     *
     * @param singerName the singer name
     */
    public void setSingerName(String singerName) {
        this.singerName = singerName;
    }

    /**
     * Gets release year of music file.
     *
     * @return the release year
     */
    public String getReleaseYear() {
        return releaseYear;
    }

    /**
     * Sets release year of music file.
     *
     * @param releaseYear the release year
     */
    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    /**
     * Print Music's information.
     */
    public void print ()
    {
        System.out.println("Music address : "+address+"| Singer : "+singerName+"| Release Year : "+releaseYear);
    }
}
