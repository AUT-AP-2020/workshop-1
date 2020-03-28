package myPack;

/**
 * a test for our program
 */

public class Main{
    public static void main(String[] args){

        MusicCollection[] categories = new MusicCollection[4];

        categories[0] = new MusicCollection("pop");
        categories[1] = new MusicCollection("jazz");
        categories[2] = new MusicCollection("rock");
        categories[3] = new MusicCollection("country");

        Music newSong = new Music("Somewhere in my laptop", "Behnam Bani", 1397);
        categories[0].addFile(newSong);

        newSong = new Music("Somewhere in my C drive", "Yanni", 1970);
        categories[1].addFile(newSong);

        newSong = new Music("Somewhere in my E drive", "Kaveh Afag", 1396);
        categories[2].addFile(newSong);

        newSong = new Music("Somewhere in my F drive", "Mohsen Yeganeh", 1388);
        categories[0].addFile(newSong);

        newSong = new Music("Somewhere deep in my laptop", "Led Zepplin", 1992);
        categories[2].addFile(newSong);

        newSong = new Music("Somewhere in my Decktop", "Motor Head", 1987);
        categories[2].addFile(newSong);

        for(MusicCollection i : categories)
            i.listAllFiles();

        System.out.println(categories[2].getNumberOfFiles());

        categories[0].removeFile(3);

        categories[2].search("Mo");

        categories[2].startPlaying(0);

        categories[2].stopPlaying();
    }
}