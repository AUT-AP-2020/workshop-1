import java.util.ArrayList;
import java.util.Iterator;

/**
 * Provide basic playing of MP3 files via the javazoom library.
 * See http://www.javazoom.net/
 *
 * @author David J. Barnes and Michael K�lling.
 * @version 2011.07.31
 */
public class MusicPlayer {
    // The current player. It might be null.
    private ArrayList<Music> favoriteMusics;
    private boolean isPlaying;

    /**
     * Constructor for objects of class MusicFilePlayer
     */
    public MusicPlayer() {
        favoriteMusics = new ArrayList<Music>();
        isPlaying = false;
    }


    /**
     * Start playing the given audio file.
     * The method returns once the playing has been started.
     *
     * @param music The file to be played.
     */

    public void addFavoriteMusic(Music music){
        favoriteMusics.add(music);
    }
    public void removeFavoriteMusic(Music music){
        Iterator<Music> it=favoriteMusics.iterator();
        while(it.hasNext()){
            Music music1=it.next();
            if(music1.equals(music)){
                it.remove();
                System.out.println("Successfully removed!");
                return;
            }
        }
        System.out.println("There is no such music in your favorite musics !");
    }
    public void printFavoriteMusicsList(){
        for(Music music:favoriteMusics){
            music.print();
        }
    }
    public void startPlaying(Music music) {
        music.print();
        System.out.println("is playing ...");
        isPlaying = true;
    }

    public void stop() {
        System.out.println("player is stopped!");
        isPlaying = false;
    }


}