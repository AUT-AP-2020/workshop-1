public class Main {
    public static void main(String[] args){
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Music m1 = new Music("new folder" , "Taylor Swift",2019);
        Music m2 = new Music("new folder" , "Taylor Swift",2017);
        Music m3 = new Music("new folder" , "Camila Cabello",2018);
        Music m4 = new Music("new folder" , "TBobby McFerrin",1988);
        Music m5 = new Music("new folder" , "Louis Armstrong",1967);
        Music m6 = new Music("new folder" , "TBobby McFerri",1980);
        pop.addFile(m1);
        pop.addFile(m2);
        pop.addFile(m3);
        pop.addFile(m4);
        pop.addFile(m5);
        pop.addFile(m6);
        pop.addFileToFavorite(pop.getMusic(0));
        pop.addFileToFavorite(pop.getMusic(2));
        pop.addFileToFavorite(pop.getMusic(4));
        System.out.println("favorite");
        pop.printFavorite();
        System.out.println("search fot Taylor Swift");
        pop.search("Taylor Swift");
        pop.listFile(2);
        System.out.println("all");
        pop.listAllFiles();
        pop.startPlaying(3);
        pop.stopPlaying();
    }
}
