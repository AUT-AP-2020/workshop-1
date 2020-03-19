import java.util.ArrayList;

public class MusicOrganizer {
    private static ArrayList<String> tracks;

    public static void removeTrack(String nameLike) {
        for (int i = 0; i < tracks.size(); i++)
            if (tracks.get(i).equals(nameLike))
                tracks.remove(tracks.get(i));
    }
}