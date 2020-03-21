package com.amirparsa.salmankhah;

public class Main {

    public static void main(String[] args) {
	    MusicCollection pop = new MusicCollection();
	    Music music1 = new Music("Ashoobam","Chaartaar",2015);
        Music music2 = new Music("Baran Toee","Chaartaar",2015);
        Music music3 = new Music("Gele kon","Chaartaar",2020);
        pop.addFile(music1);
        pop.addFile(music2);
        pop.addFile(music3);
        pop.listAllFiles();
        pop.addFavourite(0);
        pop.listFavourites();
        pop.removeFavourite(0);
        pop.listFavourites();
    }
}
