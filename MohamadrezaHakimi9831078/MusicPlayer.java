import java.util.ArrayList;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling.
 * @version 2011.07.31
 */
class MusicPlayer {
    // The current player. It might be null.
    private boolean isPlaying;
    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer()
    {
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     * @param filename The file to be played.
     */
    public void startPlaying(String filename)
    {
        System.out.println(filename + " is playing...");
        isPlaying = true;
    }

    public void stop()
    {
        System.out.println("player is stopped!");
        isPlaying = false;
    }



}

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<musics> files=new ArrayList<musics>();
    private ArrayList<musics> favorites=new ArrayList<musics>();
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection(){
    }
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename,String singer,String adress,int year)
    {
        files.add(new musics(year,singer,adress,filename));
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

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        System.out.println("list of all files from this collection");
        for (musics music:files) {
            System.out.println(music.getFilename());

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
        player.startPlaying(files.get(index).getFilename());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }
    public void add_favorite(String filename){
        for (musics music:files) {
            if(music.getFilename().equals(filename)){
                favorites.add(music);
                break;
            }
        }
    }
    public void remove_favorite(String filename){
        for (musics music:files) {
            if(music.getFilename().equals(filename)){
                favorites.remove(music);
                break;
            }
        }
    }
    public void show_favorites(){
        System.out.println("favorites:");
        for (musics music:favorites) {
            System.out.println(music.getFilename());
        }
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        // The return value.
        // Set according to whether the index is valid or not.
        if((index<files.size()-1)&&(index>=0)){return true; }
        else {
            return false;
        }
    }

}
/**
 *a class for holding details of each music
 * @author mohamadreza
 * @version 2019.03.23
 *
 */