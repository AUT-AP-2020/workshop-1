import java.util.ArrayList;
/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;
    // An ArrayList for storing the favourite music files.
    private ArrayList<Music>favourites;
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files=new ArrayList<Music>();
        favourites=new ArrayList<Music>();
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
        if(validIndex(files,index)){
            files.get(index).print();
        }
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music i:files){
            i.print();
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(files,index))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(files,index))
            player.startPlaying(files.get(index));
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
     * @param list The list to be checked
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(ArrayList list,int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        if(list.size()>=index && index>=0){
            return true;
        }
        return false;
    }

    /**
     * Add a file to the favourites.
     * @param music The file to be added
     */
    public void addFavourite(Music music){
        favourites.add(music);
    }

    /**
     * Remove a file from favourites
     * @param index The index of the file to be removed.
     */
    public void removeFavourite(int index){
        if(validIndex(favourites,index)){
            favourites.remove(index);
        }
    }

    /**
     * Show favourite list files
     */
    public void listAllFavourites(){
        for(Music i:favourites){
            i.print();
        }
    }

    /**
     * Search a String in address file or singer name
     * @param search The String to be checked
     */
    public void searchMusic(String search){
        for(Music i:files){
            if(i.getAddress().equals(search) || i.getSinger().equals(search)){
                i.print();
            }
        }
    }
}