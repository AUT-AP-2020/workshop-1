
/**
@author Sina
@version 1.1
well this is designed to have info about each song
its the main frame of each song detail
including such as name,artist name, the year published,address file
 */
public class Music {
    private String Name;
    private String Artist;
    private int TheYear;
    private String AddressFile;

    public Music(String Address,String songName,String artist,int yearPublished)
    {
        this.AddressFile=Address;
        this.Artist=artist;
        this.TheYear=yearPublished;
        this.Name=songName;
    }
    /**
        @return  it will provide us the name of the song !
     */
    public String getName() {
        return Name;
    }
    /**
        @return  it will give us the name of the singer !
     */
    public String getArtist() {
        return Artist;
    }
    /**
        @return  it will give tell us which year this song was published !
     */
    public int getTheYear() {
        return TheYear;
    }
    /**
        @return AddressFile it will tell us where is this song located !
     */
    public String getAddressFile() {
        return AddressFile;
    }
    /**
    @param addressFile it will provide info about where is this song located !
     */
    public void setAddressFile(String addressFile) {
        AddressFile = addressFile;
    }
    /**
     * @param artist it will provide the field with the name of the singer!
     */
    public void setArtist(String artist) {
        Artist = artist;
    }
    /**
        @param name it will provide the field with the name of the song !
     */
    public void setName(String name) {
        Name = name;
    }
    /**
        @param theYear it will provide the info about the year published !
     */
    public void setTheYear(int theYear) {
        TheYear = theYear;
    }

}
