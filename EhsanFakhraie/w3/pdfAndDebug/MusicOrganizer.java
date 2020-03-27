package pdfAndDebug;

import java.util.ArrayList;
import java.util.Iterator;

public class MusicOrganizer {
    private ArrayList<String> tracks;

    public void removeTrack(String nameLike) {
        Iterator<String> it = tracks.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if (t.contains(nameLike))
                it.remove();
        }
        //using for loop for removing is wrong
        /**
         for (int i = 0; i < tracks.size(); i++)
         if (tracks.get(i).contains(nameLike))
         tracks.remove(i);
         */
    }
}
