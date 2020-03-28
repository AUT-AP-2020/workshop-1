import java.util.Date;

/**
 * hold information of a song .
 */
public class Song {
    //location of file where the song is stored
    private String file;
    // the name of singer.
    private String singer;
    // time that the song was released
    private Date releaseDate;

    /**
     * a simple constructor for Song class.
     * @param file location of file where the song is stored
     * @param singer the name of singer
     * @param releaseDate time that the song was released
     */
    public Song (String file, String singer, Date releaseDate)
    {
        this.file = file;
        this.singer = singer;
        this.releaseDate = releaseDate;
    }

    ///////////////////////////////////////////////////////////////////////
    /////   Getters and Setters
    ///////////////////////////////////////////////////////////////////////


    /**
     * simple getter for File.
     * @return String: File.
     */
    public String getFile() {
        return file;
    }


    /**
     * simple getter for Singer.
     * @return String: singer.
     */
    public String getSinger() {
        return singer;
    }


    /**
     * simple getter for ReleaseDate.
     * @return Date: releaseDate.
     */
    public Date getReleaseDate() {
        return releaseDate;
    }


}
