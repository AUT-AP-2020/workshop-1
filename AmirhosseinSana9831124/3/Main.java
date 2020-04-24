public class Main {
    public static void main(String args[]) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        Music music1 = new Music("f1", 1, "s1");
        Music music2 = new Music("f2", 1, "s2");
        Music music3 = new Music("f3", 1, "s3");
        Music music4 = new Music("f4", 1, "s4");
        Music music5 = new Music("f5", 1, "s5");

        pop.addFile(music1);
        pop.addFile(music2);
        pop.addFile(music4);

        pop.listAllFiles();

        pop.startPlaying(0);
        pop.stopPlaying();

        pop.listFile(2);

        pop.removeFile(1);

        pop.listAllFiles();

        pop.addToFavorites(1);

        pop.listFavorites();
    }
}
