/**
 * A class to hold the details of each music piece.
 *
 * @author Erfan.A
 * @version 0.0
 */
public class Music {
    // the address of the music file
    private String address;
    // the singer of the music
    private String artist;
    // the year of the music production
    private int year;

    /**
     * create a music instance with the given address, singer and year of production
     *
     * @param add the address of the music file.
     * @param singer the artist of the music.
     * @param year the year of the music production.
     */
    public Music(String add, String singer, int year){
        address = add;
        artist = singer;
        this.year = year;
    }

    /**
     * @param address set the address of the music file
     */
    public void setAddress(String add){
        address = add;
    }

    /**
     * get the address of the music file
     * @return address field
     */
    public String getAddress(){
        return address;
    }

    /**
     * @param singer set the artist of the music file
     */
    public void setArtist(String singer){
        artist = singer;
    }

    /**
     * get the artist of the music file
     * @return artist field
     */
    public String getArtist(){
        return artist;
    }

    /**
     * @param year set the year of the production of the music file
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * get the production year of the music
     * @return year field
     */
    public int getYear(){
        return year;
    }

}
