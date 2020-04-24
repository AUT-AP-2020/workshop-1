import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
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
        files=new ArrayList<>();
        player=new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {

        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        System.out.println(files.get(index).getName());
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (int i = 0; i <files.size() ; i++) {
            System.out.println(files.get(i).getName());
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getName());
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
        if(index<files.size()&&index>=0)
        return true;
        else{
            System.out.println("invalid index!");
            return false;
        }
    }
    public void search(String musicName){
        for (int i = 0; i <files.size() ; i++) {
            if(files.get(i).getName().contains(musicName)||files.get(i).getSingerName().contains(musicName))
                System.out.println(files.get(i).getName());
        }
    }

    public ArrayList<Music> getFiles() {
        return files;
    }
}