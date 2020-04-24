import java.util.ArrayList;
public class MusicOrganizer {
    private ArrayList<String> tracks = new ArrayList<>(); // we must use new to declare an Arraylist
    public void removeTrack(String nameLike) {
        for (int i = 0; i < tracks.size(); i++) // the last member number is tracks.size()-1
            if (tracks.get(i).contains(nameLike)) { // remove an object from collaction Cause Arraylist size be low
                tracks.remove(i);
                i--;
            }
    }
}