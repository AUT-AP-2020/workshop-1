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
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files= new ArrayList<>();
        player= new MusicPlayer();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music musicFile)
    {
        files.add(musicFile);
        return;
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
            System.out.printf((index+1)+") ");
            files.get(index).printinfo();
        }
        return;
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("Number of songs in this collection: "+ getNumberOfFiles());
        for(int i=0; i<getNumberOfFiles(); i++){
            listFile(i);
        }
        
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)){
            Iterator <Music> it= files.iterator();
            int i=0;
            while(it.hasNext()){
                it.next();
                if(i==index){
                    it.remove();
                    break;
                }
                i++;
            }
        }
        return;
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        player.startPlaying(files.get(index).getFileAddress());
        return;
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
        return;
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        if(index>=0 && index<getNumberOfFiles()){
            return true;
        }
        return false;
    }

    /**
     * method for setting a song as favorite
     * @param index of the song in the files array list  
     */
    public void setFavorite(int index){
        files.get(index).setFav(true);
        return;
    }

    /**
     * @param index of the song in the files array list  
     */
    public void unfav(int index){
        files.get(index).setFav(false);
        return;
    }

    /**
     * print the favorite songs of this collection
    */
    public void printFavorite(){
        int j=1;
        for(int i=0; i<getNumberOfFiles(); i++){
            if(files.get(i).getIsFav()){
                System.out.println(j+") "+ files.get(i).getFileAddress());
                j++;
            }
        }
        if(j==1){
            System.out.println("no favorite songs in the list");
        }
        return;
    }

    /**
     * this method iterates in the files array list and searchs for a Music object with filename or singername same as the searched string  
     * @param searched is the string searched by the user
    */
    public void printResultSearch(String searched){
        int j=1;
        for(int i=0; i<getNumberOfFiles(); i++){
            if(files.get(i).getFileAddress().equals(searched)||files.get(i).getSingerName().equals(searched)){
                System.out.println(j+") ");
                files.get(i).printinfo();
                j++;
            }
        }
        if(j==1){
            System.out.println("didn't find anything with name of:"+ searched);
        }
        return;
    }
}