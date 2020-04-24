import java.security.PublicKey;

/**
 * This Class represents a music in music collection
 * 
 * it holds the name, artist and production year of the music
 *
 * @author Mohammad Mahdi Malmasi
 * @version 0.0.0
 */
public class Music 
{
    //the name of the music
    private String name;

    //the artist of the music
    private String artist;
    
    //the music production year
    private int productYear;




          /* Constructor */

    /**
     * Creat a new {@code Music} with given name, artist and production year 
     *
     * @param name : the name of the music
     * @param artist : the artist of the music
     * @param productYear : the music production year
     */
    public Music(String name, String artist, int productYear) 
    {
        this.name = name;
        this.artist = artist;
        this.productYear = productYear;
    }

    

    
    /**
     * set the artist of the music
     * @return artist of the music
     */
    public String getArtist() 
    {
        return artist;
    }
    

    /**
     * @return the name of the music
     */
    public String getName() 
    {
        return name;
    }


    /**
     * @return the production year of the music
     */
    public int getProductYear() 
    {
        return productYear;
    }

    
    /**
     * this method show the music info in standard output terminal()
     */
    public void print(){
        System.out.println("\t\t" + "Name: " + name 
                                  + 
                                    ", Artist: " + artist 
                                  + "Production Year: " + productYear);
    }
}