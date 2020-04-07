public class Main {

    public static void main(String[] args){
        MusicCollection pop = new MusicCollection();
        MusicFile m1 = new MusicFile("a1","1","aa1");
        MusicFile m2 = new MusicFile("a2","2","aa2");
        MusicFile m3 = new MusicFile("a3","3","aa3");
        MusicFile m4 = new MusicFile("a4","4","aa4");
        MusicFile m5 = new MusicFile("a5","5","aa5");
//        MusicCollection jazz = new MusicCollection();
//        MusicCollection rock = new MusicCollection();
//        MusicCollection country = new MusicCollection();
        pop.addFile(m1);
        pop.addFile(m2);
        pop.addFile(m3);
        pop.addFile(m4);
        pop.addFile(m5);
        System.out.println(pop.getNumberOfFiles());
        pop.listAllFiles();
        System.out.println();
        pop.listFile(3);
        pop.removeFile(2);
        System.out.println(pop.getNumberOfFiles());
        pop.listAllFiles();
        pop.startPlaying(1);
        pop.stopPlaying();
        pop.addFavoriteMusic(m1);
        pop.addFavoriteMusic(m2);
        pop.addFavoriteMusic(m3);
        pop.allFavoriteMusic();
        pop.removeFavoriteMusic(m2);
        pop.allFavoriteMusic();
        pop.search("a1");
        pop.search("a6");
    }
}
