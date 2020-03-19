/**
 * A class to categorized music pieces into different groups
 *
 * @author Erfan.A
 * @version 0.0
 */

public class Main {

    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Music music1 = new Music("C:/Music1", "jahan", 1987);
        Music music2 = new Music("C:/Music2", "hesam", 1988);
        Music music3 = new Music("C:/Music3", "erfan", 1989);
        Music music4 = new Music("C:/Music4", "ali", 1999);
        Music music5 = new Music("C:/Music5", "hassan", 1997);
        Music music6 = new Music("C:/Music6", "hossein", 1993);
        Music music7 = new Music("C:/Music7", "hamid", 1981);
        pop.addFile(music1);
        pop.addFile(music2);
        pop.addFile(music3);
        pop.listAllFiles();
        pop.addFavoriteMusic(music1);
        pop.Search("jahan");
        jazz.addFile(music4);
        jazz.addFile(music5);
        jazz.addFile(music6);
        jazz.addFile(music7);
        jazz.addFavoriteMusic(music4);
        jazz.addFavoriteMusic(music5);
        jazz.listFavorites();
    }
}
