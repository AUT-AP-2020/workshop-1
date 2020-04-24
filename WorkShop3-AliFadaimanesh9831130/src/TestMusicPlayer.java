/**
 * here is the test for MusicCollection and MusicPlayer Interaction
 */
public class TestMusicPlayer {
    public static void main(String[] args) {
        //before adding Music class
//        MusicCollection collection = new MusicCollection();
//        collection.addFile("C:\\Users\\afada\\Music\\Download\\Summer.mp3");
//        collection.startPlaying(0);
//        collection.stopPlaying();
        //PlayingMusic
        //
        //after making Music Class

        MusicCollection collection = new MusicCollection();
        collection.addFile("salam", "mammad", "1980", "Pop");
        collection.removeFile(0);
        collection.listAllFiles();
    }
}
