import java.util.ArrayList;
impo

public class MusicOrganization {
    private ArrayList<String> tracks = new ArrayList<String>();

    public void removeTrack(String nameLike) {
        Iterator
        for (int i = 0; i < tracks.size(); i++) {
            if (tracks.get(i).contains(nameLike)) {
                tracks.remove(i);
                break;
            }
        }
    }
}
