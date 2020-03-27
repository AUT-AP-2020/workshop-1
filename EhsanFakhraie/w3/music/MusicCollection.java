package music;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> musics;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        musics = new ArrayList<Music>();
        player = new MusicPlayer();
    }

    /**
     * Add a file to the collection.
     *
     * @param music The file to be added.
     */
    public void addMusic(Music music) {
        if (!musics.contains(music))
            musics.add(music);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
                   return musics.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        System.out.println(musics.get(index));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        musics.forEach(System.out::println);
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        musics.remove(musics.get(index));
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        player.startPlaying(musics.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        try{
            musics.get(index);
            return true;
        }catch (Exception e){
            return false;
        }
        // The return value.
        // Set according to whether the index is valid or not.
    }

    public void search(String query){
        MusicCollection searchResult=new MusicCollection();
        musics.forEach((music)->{
            if(music.getName().contains(query))
                searchResult.addMusic(music);
            if(music.getSinger().contains(query))
                searchResult.addMusic(music);
        });

        searchResult.listAllFiles();

    }
}