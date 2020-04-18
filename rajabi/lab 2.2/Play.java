package com.company;

import java.util.Iterator;

/**
 * Play class represents a collection of musics
 * @author Rajabi2001
 */
public class Play {

    public static void main(String[] args) {

       /* MusicCollection[] categories = new MusicCollection[4];
        categories[0] = new Object("sdf");*/

        MusicCollection pop = new MusicCollection();
        MusicCollection jazz = new MusicCollection();
        MusicCollection rock = new MusicCollection();
        MusicCollection country = new MusicCollection();

        pop.addFile("Javad","1380","<Roads untraveled>");
        pop.addFile("Alo","1380","<Every night>");

        jazz.addFile("Amin","1375","<Kind of blue>");
        jazz.addFile("Taha","1385","<A love supreme>");

        rock.addFile("Mahi","1388","<Never mind>");
        rock.addFile("Saeid","1382","<Back in black>");

        country.addFile("Tb","1390","<I walk the line>");
        country.addFile("Selena","1392","<Amazed>");

        //size of a collection
        System.out.println(pop.getNumberOfFiles());

        //remove a song from the collection
        System.out.println("before removing");
        pop.listAllFiles();
        pop.removeFile(1);
        System.out.println("after removing");
        pop.listAllFiles();

        //start & stop playing a song
        pop.startPlaying(0);
        pop.stopPlaying(0);

        jazz.startPlaying(1);
        country.removeFile(0);
        jazz.startPlaying(1);

        //search a song by it's name or singer
        jazz.searchName("<K");
        jazz.searchSinger("Ta");

    }
}
