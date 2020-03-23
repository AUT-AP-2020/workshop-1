package LAB3;

/**
 * this is a testing class for the music classes.
 */

public class Run2 {
    public static void main(String[] args) {
        MusicCollection[] musicCollection = new MusicCollection[4];
        musicCollection[0] = new MusicCollection("Pop");
        musicCollection[1] = new MusicCollection("Jazz");
        musicCollection[2] = new MusicCollection("Rock");
        musicCollection[3] = new MusicCollection("Country");
        Music ms1 = new Music("s1", "s2", 231, "s3");
        Music ms2 = new Music("d1", "d2", 231, "d3");
        Music ms3 = new Music("e1", "e2", 231, "e3");
        Music ms4 = new Music("f1", "f2", 231, "f3");
        musicCollection[0].addMusic(ms1);
        musicCollection[1].addMusic(ms2);
        musicCollection[2].addMusic(ms3);
        musicCollection[3].addMusic(ms4);
        for (int i = 0; i < 4; i++)
            musicCollection[i].listAllFiles();

    }
}
