import java.util.ArrayList;
import java.util.Iterator;

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
    // An arraylist for favorite files
    private ArrayList<Music> favorites;    
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<Music>();
        favorites = new ArrayList<Music>();
        player = new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param file The file to be added.
     */
    public void addFile(Music file)
    {
        files.add(file);
    }

    /**
     * add favorite music to list of favorites
     * @param file favorite music
     */

    public void addFavorite(Music file){
        
        for(Music filename : files){
            if(file.equals(filename)){
                favorites.add(file);
                return;
            }
        }
        System.out.println("your music is not found !!");
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
        if(validIndex(index)){
        System.out.println(files.get(index).getAddress()+" "+files.get(index).getSinger()+" "+files.get(index).getYear());
        }
        else{
            System.out.println("wrong index");
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        Iterator<Music> it = files.iterator();
        while(it.hasNext()){
            Music file = it.next();
            System.out.println(file.getAddress()+" "+file.getSinger()+" "+file.getYear());
        }
    }
 
    /**
     * Show a list of all the favorites in the collection.
     */
    public void listFavorites(){
        Iterator<Music> it = favorites.iterator();
        while(it.hasNext()){
            Music file = it.next();
            System.out.println(file.getAddress()+" "+file.getSinger()+" "+file.getYear());
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)){
            Iterator<Music> it = files.iterator();
            int count = 0;
            while(it.hasNext()){
                it.next();
                if(count == index){
                    it.remove();
                    return;
                }
                count++;
            }
        }
        else{
            System.out.println("wrong index");
        }
    }
    /**
     * remove selected music from favorites
     * @param file file of selected music 
     */

    public void removeFavorite(Music file){
        Iterator<Music> it = favorites.iterator();
        
        while(it.hasNext()){
            Music file1 = it.next();
            if(file.equals(file1)){
                it.remove();
                return;
            }
        }
        System.out.println("your selected music is not found");
    }


    public void search(String name){
        Iterator<Music> it = files.iterator();
        while(it.hasNext()){
            Music file = it.next();
            String fAddress = file.getAddress();
            String fSinger = file.getSinger();
            if(name.equals(fAddress)||name.equals(fSinger)){
                System.out.println(file.getAddress()+" "+file.getSinger()+" "+file.getYear());
                return;
            }
        }
        System.out.println("this music is not found");
    }
    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getAddress());
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
       if(index<files.size()){
           return true;
       }
       else{
           return false;
       }
    }
}