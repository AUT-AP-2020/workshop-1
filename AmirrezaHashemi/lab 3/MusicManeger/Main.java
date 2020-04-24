public class Main {

    public static void main(String[] args) {
        MusicCollection[] categories = new MusicCollection[4];
        categories[0] = new MusicCollection("pop");
        categories[1] = new MusicCollection("jazz");
        categories[2] = new MusicCollection("rock");
        categories[3] = new MusicCollection("country");
        Music music1 = new Music("D","Adele","2011");
        Music music2 = new Music("D","Radiohead","2012");
        Music music3 = new Music("C","U2","2013");
        Music music4 = new Music("E","Coldplay","2014");
        Music music5 = new Music("C","REM","2015");
        Music music6 = new Music("D","Frank sinatra","2016");
        Music music7 = new Music("D","Elvis presley","2016");
        categories[0].addFile(music1);
        categories[1].addFile(music6);
        categories[2].addFile(music2);
        categories[2].addFile(music3);
        categories[2].addFile(music4);
        categories[2].addFile(music5);
        categories[3].addFile(music7);
        categories[2].listAllFiles();
        System.out.println(categories[2].getNumberOfFiles());
        categories[1].startPlaying(0);
        categories[1].stopPlaying();
        categories[2].removeFile(0);
        categories[2].listAllFiles();
        categories[2].removeFile(7); //invalid
        categories[2].addFile(music2);
        categories[2].search("U2");
        categories[2].addFavourite(music6); //invalid
        categories[2].addFavourite(music2);
        categories[2].addFavourite(music3);
        categories[2].printFavourite();
        categories[2].removeFavourite(music5); //invalid
        categories[2].removeFavourite(music2);
        categories[2].printFavourite();












    }
}
