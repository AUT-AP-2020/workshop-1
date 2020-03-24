/**
 * testing MusicCollection, Music, MusicPlayer Classes
 */
public class Main {
    /**
     * main method
     * 
     * @param args
     */
    public static void main(String[] args) {
        // testing different methods
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        pop.addFile(new Music("D:/Music/music1", "2pac", "1996"));
        pop.addFile(new Music("D:/Music/music2", "yeong wook jo", "2003"));
        jazz.addFile(new Music("D:/Music/music3", "sting", "1994"));
        jazz.addFile(new Music("D:/Music/music4", "biggie", "1996"));
        rock.addFile(new Music("D:/Music/music5", "eminem", "2001"));
        rock.addFile(new Music("D:/Music/music6", "jesper kyd", "2001"));
        country.addFile(new Music("D:/Music/music7", "john lenon", "1970"));
        country.addFile(new Music("D:/Music/music8", "big L", "1996"));
        System.out.println(pop.getNumberOfFiles());
        jazz.listAllFiles();
        rock.listFile(6);
        rock.listFile(-1);
        rock.listFile(0);
        country.removeFile(1);
        country.addFile(new Music("D:/Music/music9", "big pun", "1998"));
        pop.stopPlaying();
        pop.startPlaying(0);
        pop.stopPlaying();
        /*
        adding favorite songs feature
        no need to add methods to MusicCollection class
        making another MusicCollection will do just fine
        */
        MusicCollection favoriteSongs = new MusicCollection();
        // adding to favorite songs
        favoriteSongs.addFile(pop.getFiles().get(1));
        favoriteSongs.addFile(country.getFiles().get(1));
        favoriteSongs.addFile(jazz.getFiles().get(1));
        favoriteSongs.addFile(rock.getFiles().get(1));
        // removing from favorite songs
        favoriteSongs.removeFile(4);
        favoriteSongs.removeFile(3);
        // listing favorite songs
        favoriteSongs.listAllFiles();
    }
}