import java.util.ArrayList; 
 
public class MusicOrganizer {  
    private ArrayList<String> tracks; 
 
    public void removeTrack(String nameLike) {
        for (int i = 0; i <= tracks.size(); i++){ 
            if(tracks.get(i).contains(nameLike)){    
                tracks.remove(i); 
            }
        }
    } 
} 