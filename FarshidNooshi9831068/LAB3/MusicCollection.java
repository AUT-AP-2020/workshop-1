package LAB3;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> musicArrayList, likedArrayList;
    private final String nameOfCollection;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection(String nameOfCollection) {
        this.nameOfCollection = nameOfCollection;
        musicArrayList = new ArrayList<>();
        player = new MusicPlayer();
        likedArrayList = new ArrayList<>();
    }

    /**
     * Add a file to the collection.
     *
     * @param musicToAdd The file to be added.
     */
    public void addMusic(Music musicToAdd) {
        musicArrayList.add(musicToAdd);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfMusics() {
        return musicArrayList.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (valid(index))
            musicArrayList.get(index).print();
    }

    /**
     *
     * @param idx will be liked
     */
    public void likeNewMusic(int idx) {
        if (valid(idx))
            likedArrayList.add(musicArrayList.get(idx));
    }

    /**
     *
     * @param idx will be removed from liked list
     */
    public void removeLikedMusic(int idx) {
        if (valid2(idx))
            likedArrayList.remove(idx);
    }

    /**
     *
     * @param idx in the liked list will be printed
     */
    public void printLikedMusic(int idx) {
        if (valid2(idx))
            likedArrayList.get(idx).print();
    }

    /**
     * this method is for printing all the musics
     */
    public void printAllLikedMusics() {
        for (Music tmp : likedArrayList)
            tmp.print();
    }
    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param idx The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean valid(int idx) {
        return idx >= 0 && idx < musicArrayList.size();
    }

    /**
     *
     * @param idx is the index to be checked
     * @return true if the index is valid in likedArrayList, false otherwise
     */
    private boolean valid2(int idx) {
        return idx >= 0 && idx < likedArrayList.size();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (Music tmp : musicArrayList)
            tmp.print();
    }

    /**
     *
     * @param pattern will be searched in the list of strings
     *                in the name & address & singer
     */
    public void searchMusic(String pattern) {
        for (Music tmp : musicArrayList)
            if (tmp.getAddress().contains(pattern) || tmp.getName().contains(pattern) || tmp.getSinger().contains(pattern))
                tmp.print();
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (valid(index))
            musicArrayList.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (valid(index))
            player.startPlaying(musicArrayList.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }
}
