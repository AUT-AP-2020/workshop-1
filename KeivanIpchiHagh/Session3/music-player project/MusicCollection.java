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

    MusicPlayer player;

    /**
     * MusicCollection Constructor
     * @param collectionName Collection name
     */
    public MusicCollection(String collectionName) {
        this.collectionName = collectionName;
        this.player = new MusicPlayer();
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
     * Get number of musics
     * @return Number of musics
     */
    public int getNumberOfMusics() {
        return musics.size();
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
     * @param music Music
     */
    public void removeMusic(Music music) {
        Iterator<Music> iterator = musics.iterator();
        while (iterator.hasNext()) {
            Music current = iterator.next();
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

    public void startPlaying(int i) {
        player.startPlaying(musics.get(i).getAddress());
    }

    public void stopPlaying() {
        player.stop();
    }
}