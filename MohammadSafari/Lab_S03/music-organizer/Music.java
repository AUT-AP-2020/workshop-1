/**
 * Music Specifications are implemented in Music class.
 * 
 * @author M.Safari
 * @version 1.0.0
 */
public class Music {
    // title of Music
    private String title;
    // artist of music
    private String artist;
    // album of music if exists
    private String album;
    // address to music
    private String address;
    // year in which music has been published
    private int publishedYear;

    /**
     * Tags and specifications for the Music in three mode
     * 
     * @param title
     * @param artist
     * @param address
     * @param publishedYear (optional)
     * @param album         (optional)
     */
    public Music(String title, String artist, String address) {
        this.title = title;
        this.artist = artist;
        this.address = address;
        this.publishedYear = 0;
        this.album = "";
    }

    public Music(String title, String artist, String address, int publishedYear) {
        this.title = title;
        this.artist = artist;
        this.address = address;
        this.publishedYear = publishedYear;
        this.album = "";
    }

    public Music(String title, String artist, String address, int publishedYear, String album) {
        this.title = title;
        this.artist = artist;
        this.address = address;
        this.publishedYear = publishedYear;
        this.album = album;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the album
     */
    public String getAlbum() {
        return album;
    }

    /**
     * @return the publishedYear
     */
    public int getPublishedYear() {
        return publishedYear;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 
     * @param check
     * @return whether the musics are addressed the same
     */
    public boolean equals(Music check) {
        return (check.getAddress() == this.getAddress()) ? true : false;
    }

}