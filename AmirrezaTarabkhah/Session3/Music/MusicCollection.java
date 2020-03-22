import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
    private String name;
    private Music mname;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     * @param newFile The file to be added.
     */
    public void addFile(Music newFile)
    {
        files.add(newFile);
    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return (files.size());
    }

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if (index >= 0 && index < files.size())
            System.out.println(files.get(index - 1));
        else
            System.out.println("Invalid number!!!");
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (Music lname: files)
        {
            lname.print();
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index - 1);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        mname = files.get(index - 1);
        player.startPlaying(mname.getName());
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
        return true;
    }

    public void search(String sname)
    {
        for (Music i: files) {
            if (sname.equals(i.getName())) {
                i.print();
                break;
            }
        }
    }
}