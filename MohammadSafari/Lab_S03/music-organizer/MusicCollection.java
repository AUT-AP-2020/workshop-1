import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael K�lling(Modified by Mohammad Safari)
 * @version 2020.03.23
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    // private ArrayList<String> files;
    // An ArrayList for storing the specifications of musics.
    private ArrayList<Music> musics;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        player = new MusicPlayer();
        musics = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     * 
     * @param filename The file to be added.
     */
    public void addMusic(Music music) {
        for (Music track : musics)
            if (music.equals(track))
                return;
        musics.add(music);
        System.out.println(music.getTitle() + " by " + music.getArtist() + " added to Collection");

    }

    /**
     * Return the number of files in the collection.
     * 
     * @return The number of files in the collection.
     */
    public int getNumberOfMusic() {
        return musics.size();
    }

    /**
     * List a Music from the collection.
     * 
     * @param index The index of the file to be listed.
     */
    public void listMusic(int index) {
        Music music = musics.get(index);
        String details = " ";
        if (music.getPublishedYear() != 0) {
            if (music.getAlbum() != "") {
                details = details.concat(music.getAlbum() + " ");
            }
            details = details.concat(", Published in  " + music.getPublishedYear());
        }
        System.out.println(music.getTitle() + " by " + music.getArtist() + ":" + details);
    }

    /**
     * Show a list of all the musics in the collection.
     */
    public void listAllMusics() {
        for (Music music : musics)
            System.out.println(musics.indexOf(music) + ") " + music.getTitle() + " by " + music.getArtist());

    }

    /**
     * Remove a file from the collection.
     * 
     * @param index The index of the file to be removed.
     */
    public void removeMusic(int index) {
        if (validIndex(index))
            for (Music music : musics)
                if (musics.indexOf(music) == index) {
                    musics.remove(music);
                    System.out.println(music.getTitle() + " by " + music.getArtist() + " removed from Collection");
                    break;
                }

    }

    /**
     * Start playing a file in the collection. Use stopPlaying() to stop it playing.
     * 
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index))
            player.startPlaying(musics.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection. Print an error
     * message if it is not.
     * 
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        return (index >= 0 && index < musics.size()) ? true : false;
        // The return value.
        // Set according to whether the index is valid or not.

    }
}