/**
 * @author Sepehr Moghiseh
 * @version 0.0
 * a class to create and organize the musics in a specific collection.
 */
public class Main {
    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();
        Music musicPop =new Music("kind of love","rat city",2017);
        Music musicPop2 =new Music("bills","lunchmoney lewis",2016);
        Music musicJazz =new Music("test","testsinger",2016);
        Music musicJazz2 =new Music("test2","testsinger2",2015);
        Music musicRock =new Music("birds","imagine dragons",2018);
        Music musicRock2 =new Music("digital","imagin dragons",2018);
        Music musicCountry =new Music("jump to the moon","u mad",2017);
        Music musicCountry2 =new Music("shake the tree","simon field",2018);
        pop.addFile(musicPop);
        pop.addFile(musicPop2);
        jazz.addFile(musicJazz);
        jazz.addFile(musicJazz2);
        rock.addFile(musicRock);
        rock.addFile(musicRock2);
        country.addFile(musicCountry);
        country.addFile(musicCountry2);

        FavoriteMusic favoriteMusic=new FavoriteMusic();
        favoriteMusic.addMusicFavorite(musicJazz2);
        favoriteMusic.addMusicFavorite(musicRock);
        favoriteMusic.print();

        favoriteMusic.removeMusicFavorite(musicJazz2);
        favoriteMusic.print();

        pop.search("kind");
        jazz.search("test");
        rock.listAllFiles();
        country.startPlaying(1);
        country.stopPlaying();

    }
}
