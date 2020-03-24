import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<MusicFile> files;
    // A player for the music files.
    private MusicPlayer player;
    private ArrayList<MusicFile> list;
    private ArrayList<MusicFile> favorite;

    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<MusicFile>();
        list = new ArrayList<MusicFile>();
        player = new MusicPlayer();
        favorite = new ArrayList<MusicFile>();
    }

    /**
     * Add a file to the collection.
     *
     * @param filename The file to be added.
     */
    public void addFile(MusicFile filename) {
        files.add(filename);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (validIndex(index))
            list.add(files.get(index - 1));
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        for (MusicFile i : files)
            System.out.println("singer: " + i.getSinger() +
                    ", fire address: " + i.getFileAddress() +
                    ", year: " + i.getYear());
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index))
            files.remove(files.get(index - 1));
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index))
            player.startPlaying(files.get(index - 1));
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
        if (index > 0 && index <= files.size())
            return true;
        else {
            System.out.println("invalid index!");
            return false;
        }

    }

    public void addFavoriteMusic(MusicFile music) {
        favorite.add(music);
    }

    public void removeFavoriteMusic(MusicFile music) {
        favorite.remove(music);
    }

    public void allFavoriteMusic() {
        for (MusicFile i : favorite)
            System.out.println("favorite music: " + "singer: " + i.getSinger() +
                    ", fire address: " + i.getFileAddress() +
                    ", year: " + i.getYear());
    }

    public void search(String str) {
        boolean flage = false;
        for (MusicFile i : files) {
            if ((i.getYear()).equals(str) || (i.getFileAddress()).equals(str) || (i.getSinger()).equals(str)) {
                System.out.println("searched music: ");
                System.out.println("favorite music: " + "singer: " + i.getSinger() +
                        ", fire address: " + i.getFileAddress() +
                        ", year: " + i.getYear());
                flage = true;
            }
        }
        if(!flage)
        System.out.println("music not found!");
    }
}