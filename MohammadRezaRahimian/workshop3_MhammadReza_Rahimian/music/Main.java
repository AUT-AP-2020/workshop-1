package music;
public class Main {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        SongInfo song1 = new SongInfo("pop1","sN1",2020);
        SongInfo song2 = new SongInfo("jazz1","sN2",2018);
        SongInfo song3 = new SongInfo("rock1","sN3",2019);
        SongInfo song4 = new SongInfo("rock2","sN4",2021);
        SongInfo song5 = new SongInfo("country1","sN5",2021);
        SongInfo song6 = new SongInfo("rock3","sN6",2017);
        SongInfo song7 = new SongInfo("jazz2","sN7",2010);
        SongInfo song8 = new SongInfo("jazz3","sN8",2015);
        SongInfo song9 = new SongInfo("rock4","sN9",2016);
        pop.addFile(song1);
        jazz.addFile(song2);
        jazz.addFile(song7);
        jazz.addFile(song8);
        rock.addFile(song3);
        rock.addFile(song4);
        rock.addFile(song6);
        rock.addFile(song9);
        country.addFile(song5);
        System.out.println(pop.getNumberOfFiles());

        jazz.listFile(0);

        rock.listAllFiles();

        jazz.addFavoriteSongs("jazz2");

        jazz.printFavoriteSongs();

        country.startPlaying(0);
        country.stopPlaying();
    }
}
