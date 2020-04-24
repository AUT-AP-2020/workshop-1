import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> tracks;
    private ArrayList<Music> favorites;
    // A player for the music files.
    private MusicPlayer player;
        
    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
    	tracks = new ArrayList<>();
        favorites = new ArrayList<>();
    	player = new MusicPlayer();
    }

	/**
	 *	Add a track file to the collection
	 *	@param track The file to add
	 */
    public void addFile(Music track) {
        tracks.add(track);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return tracks.size();
    }
    
    public Music getTrack(int index) {
    	if(!validIndex(index)) return null;
    	return tracks.get(index);
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if(!validIndex(index)) return;
        tracks.get(index).print();
    }
    
    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
    	System.out.println(tracks.size() + " items");
        for(Music track:tracks)
        	track.print();
        System.out.println("");
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if(!validIndex(index)) return;
        tracks.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if(!validIndex(index)) return;
        player.startPlaying(tracks.get(index));
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Add one of tracks items into the favorites
     * @param index
     */
    public void addFavorite(int index) {
    	if(!validIndex(index)) return;
    	favorites.add(tracks.get(index));
    }

    /**
     * Removes one of tracks from favorites
     * @param index
     */
    public void removeFavorite(int index) {
    	if(index<0 || index>=favorites.size()) return;
    	favorites.remove(index);
    }

    /**
     * Removes one of tracks from favorites
     * @param track
     */
    public void removeFavorite(Music track) {
    	Iterator<Music> it = favorites.iterator();
    	while(it.hasNext()) {
    		Music tmp = it.next();
    		if(tmp.equals(track))
    			it.remove();
    	}
    }

    /**
     * Lists the favorite tracks
     */
    public void listFavorites() {
    	System.out.println("Favorites: ");
    	for(Music track:favorites)
    		track.print();
    	System.out.println("");
    }
    
    public void search(String query) {
    	System.out.println("Search results for "+query+": ");
    	for(Music track:tracks)
    		if(track.getAddress().contains(query) || track.getSinger().contains(query))
    			track.print();
    	System.out.println("");
    }
    

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) {
        return !(index<0 || index>=tracks.size());  
    }
}