import java.util.ArrayList;
import java.util.Iterator;

/**
 * <h1>Music Collection Class</h1>
 * This class contains information about a collection of musics which can be a playList or simply a genre
 * @author Keivan Ipchi Hagh
 * @version 1.0.0
 */
class MusicCollection {

    /**
     * Sotres Music Objs
     */
    ArrayList<Music> musics;

    /**
     * Every collection needs a name, right?
     */
    private String collectionName;

    /**
     * MusicCollection Constructor
     * @param collectionName Collection name
     */
    public MusicCollection(String collectiobName) {
        this.collectionName = collectiobName;
        this.musics = new ArrayList<>();
    }

    /**
     * Add music
     * @param music says what it says
     */
    public void addMusic(Music music) {
        musics.add(music);
    }

    /**
     * Add music via @override
     * @param address Address of the file (ie. Name)
     * @param artist Artist of the music
     * @param releasedYear Released year of the music
     */
    public void addMusic(String address, String artist, String releasedYear) {
        musics.add(new Music(address, artist, releasedYear));
    }

    /**
     * says as it is
     */
    public void removeMusic(Music music) {
        Iterator<Music> iterator = musics.iterator();
        while (iterator.hasNext()) {
            current = iterator.next();
            if (music.equals(current))
                iterator.remove();
        }
    }

    /**
     * Print the entire collection
     */
    public void print() {
        for (Music music: musics) {
            music.print();
        }
    }

    /**
     * Search for a music via address / artist
     * @param searchQuery search string
     */
    public void search(String searchQuery) {
        boolean found = false;
        for (Music music: musics) {
            if (music.getAddress().equals(searchQuery) || music.getArtist().equals(searchQuery)) {
                System.out.print("Result Found!) ");
                found = true;
                music.print();
            }
        }

        if (!found) {
            System.out.println("Sry, music you are trying to find, does not exist here!");
        }
    }
}