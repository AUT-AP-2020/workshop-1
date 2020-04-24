public class Run {
    public static void main(String[] args) {
        MusicCollection[] musicCollection = new MusicCollection[4];
        musicCollection[0] = new MusicCollection("Pop");
        musicCollection[1] = new MusicCollection("Jazz");
        musicCollection[2] = new MusicCollection("Rock");
        musicCollection[3] = new MusicCollection("Country");
        Music ms1 = new Music("Sunrise", "Adel", "queer1289", 1396);
        Music ms2 = new Music("midnight", "Ali", "fief1349", 1397);
        Music ms3 = new Music("Moon Shine", "Mahdi", "quid1234", 1398);
        Music ms4 = new Music("green field", "Mohammad", "norm7685", 1399);
        Music ms5 = new Music("blue sky", "Armin", "grub5679", 1390);
        musicCollection[0].addFileMusic(ms1);
        musicCollection[1].addFileMusic(ms2);
        musicCollection[2].addFileMusic(ms3);
        musicCollection[3].addFileMusic(ms4);
        musicCollection[0].addFileMusic(ms5);
        musicCollection[0].addFileMusicToFavoriteFiles(ms5);
        musicCollection[0].listAllFavoriteFiles();
        musicCollection[0].removeFavoriteFiles(ms5);
        musicCollection[0].searchMusic("blue sky");
        musicCollection[0].searchMusic("Adel");
        musicCollection[0].searchMusic("queer1289");
        musicCollection[0].startPlaying(1);
        musicCollection[0].stopPlaying();
        System.out.println(musicCollection[0].getNumberOfFiles());
        musicCollection[0].listFile(0);
        musicCollection[0].removeFileMusic(1);
        for (int i = 0; i < 4; i++)
            musicCollection[i].listAllFiles();

    }
}