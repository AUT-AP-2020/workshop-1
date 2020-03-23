/**
 * An example to run those three implemented classes!
 */
public class MyFavoriteCollections {
    public static void main(String[] args) {
        Music track1 = new Music("The Battle", "Hans Zimmer", "C:\\musics\\TheBattle.mp3"),
                track2 = new Music("Learning To Fly", "Pink Floyd", "C:\\musics\\LearningToFly.mp3", 1987,
                        "A Momentary Laps of Reason"),
                track3 = new Music("Nothing Else Matters", "Metalica", "C:\\musics\\NothingElseMatters.mp3");
        MusicCollection Rock = new MusicCollection();
        MusicCollection Favorite = new MusicCollection();
        Rock.addMusic(track2);
        Rock.addMusic(track3);
        Favorite.addMusic(track1);
        Favorite.addMusic(track2);
        Favorite.addMusic(track3);
        Rock.listAllMusics();
        Rock.listMusic(0);
        Favorite.startPlaying(0);
        Favorite.stopPlaying();
        Favorite.removeMusic(2);
    }
}