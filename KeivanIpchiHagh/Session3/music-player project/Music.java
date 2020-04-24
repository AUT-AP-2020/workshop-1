/**
 * <h1>Music Class</h1>
 * This class contains information about each music file as well as functionality over it
 * @author Keivan Ipchi Hagh
 * @version 1.0.2
 */
class Music {

    /**
     * Address of the file (ie. Name)
     */
    private String address;
    /**
     * Artist of the music
     */
    private String artist;
    /**
     * Released year of the music
     */
    private String releasedYear;
    
    /**
     * Music Constructor
     * Initializes Obj fields
     * @param address Address of the file (ie. Name)
     * @param artist Artist of the music
     * @param releasedYear Released year of the music
     */
    public Music(String address, String artist, String releasedYear) {
        this.address = address;
        this.artist = artist;
        this.releasedYear = releasedYear;
    }

    /**
     * Getter: Get Address
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * Setter: Set Address
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Getter: Get artist
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * Setter: Set artist
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * Getter: Get released year
     * @return the releasedYear
     */
    public String getReleasedYear() {
        return releasedYear;
    }

    /**
     * Setter: Set released year
     * @param releasedYear the releasedYear to set
     */
    public void setReleasedYear(String releasedYear) {
        this.releasedYear = releasedYear;
    }

    /**
     * Prints details about the object
     */
    public void print() {
        System.out.println("Music Address: '" + this.address + "' | Artist: '" + this.artist + "' | Released Year: '" + this.releasedYear + "'");
    }
}