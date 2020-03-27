import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author Sina
 * @version 1.1
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
    files=new ArrayList<Music>();
    player=new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param music The file to be added.
     */
    public void addFile(Music music)
    {
        files.add(music);
    }

    /**
     * Return the number of files in the collection.
     * @return  The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     * well this part is little bit different
     * cause to be honest we dont say oh thats the zero song and that my first song
     *
     */
    public void listFile(int index)
    {
        Music temp= files.get(index-1);
        System.out.println(temp.getName());
        System.out.println(temp.getArtist());
        System.out.println(temp.getTheYear());
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (Music temp:files) {
            System.out.println(temp.getName());
            System.out.println(temp.getArtist());
            System.out.println(temp.getTheYear());
            System.out.println(("*   *   *   *   *   *   *   *   *   *"));
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
       files.remove(index-1);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying1(int index)
    {
        Music temp = files.get(index-1);
       player.startPlaying(temp.getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if ((index<files.size())&&(index>0))
        {
            return true;
        }
        else
            return false;
    }
    public void search(String name)
    {
        Iterator<Music> tmp = files.iterator();
        int checker =1;
        while(tmp.hasNext())
        {
             Music temp =tmp.next();
            if (temp.getArtist().equals(name))
            {
                System.out.println("the artist "+temp.getArtist()+" the song is under the name "+temp.getName()+" is available");
                checker=1;
                break;
            }
            else if (temp.getName().equals(name))
            {
                System.out.println("the song "+temp.getName()+" the artist is "+temp.getArtist()+" is available");
                checker=1;
                break;
            }

        }
        if (checker==0)
            System.out.println("the song your looking for hasnt been found !");
    }
}