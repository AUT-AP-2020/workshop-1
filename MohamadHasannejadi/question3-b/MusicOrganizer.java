import java.util.*; 
public class MusicOrganizer { 
    private ArrayList<String> tracks; 
    public void removeTrack(String nameLike) { 
        Iterator<String> it = tracks.iterator();
        while(it.hasNext()){
            String name = it.next();
            if(name.equals(nameLike)){
                it.remove();
                return;
            }   
        }
    }    
}