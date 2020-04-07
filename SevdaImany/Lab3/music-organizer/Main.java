
public class Main {
    public static void main(String[] args) {
        MusicCollection[] musicCollection = new MusicCollection[4];
        musicCollection[0] = new MusicCollection("Pop");
        musicCollection[1] = new MusicCollection("Jazz");
        musicCollection[2] = new MusicCollection("Rock");
        musicCollection[3] = new MusicCollection("Country");
        Music music1 = new Music("a", "b", "c", 1390);
        Music music2 = new Music("e", "f", "g", 1391);
        Music music3 = new Music("h", "i", "g", 1392);
        Music music4 = new Music("k", "l", "m", 1393);
        musicCollection[0].addFile(music1);
        musicCollection[1].addFile(music2);
        musicCollection[2].addFile(music3);
        musicCollection[3].addFile(music4);
        for (int i = 0; i < 4; i++)
            musicCollection[i].listAllFiles();

    }
}