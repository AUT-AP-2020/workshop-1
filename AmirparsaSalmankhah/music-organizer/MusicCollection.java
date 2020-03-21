package com.amirparsa.salmankhah;

import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 *
 * @author David J. Barnes and Michael Kolling
 * @version 2011.07.31
 */
public class MusicCollection {
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // An ArrayList for storing the favourite musics;
    private ArrayList<Music> favourites;
    // A player for the music files.
    private MusicPlayer player;


    /**
     * Create a MusicCollection
     */
    public MusicCollection() {
        files = new ArrayList<Music>();
        player = new MusicPlayer();
        favourites = new ArrayList<Music>();
    }

    /**
     * Add a file to the collection.
     *
     * @param file The file to be added.
     */
    public void addFile(Music file) {
        files.add(file);
    }

    /**
     * Return the number of files in the collection.
     *
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles() {
        return files.size();
    }

    /**
     * List a file from the collection.
     *
     * @param index The index of the file to be listed.
     */
    public void listFile(int index) {
        if (validIndex(index,files))
            files.get(index).show();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles() {
        System.out.println("List of musics:");
        int index = 0;
        for (Music music : files) {
            System.out.printf("%d) ", index);
            music.show();
            index++;
        }
    }

    /**
     * Remove a file from the collection.
     *
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if (validIndex(index,files))
            files.remove(index);
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     *
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index) {
        if (validIndex(index,files))
            player.startPlaying(files.get(index).getName());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying() {
        player.stop();
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     *
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index, ArrayList<Music> list) {
        if (index >= 0 && index < list.size())
            return true;
        System.out.println("ERROR: List index out of range");
        return false;
    }

    /**
     * Add a music to favourites with its index
     * @param index The index of the music to be added;
     */
    public void addFavourite(int index){
        if(validIndex(index,files))
            favourites.add(files.get(index));
    }

    /**
     * Add a music to favourites with its index
     * @param index The index of the music to be removed;
     */
    public void removeFavourite(int index){
        if(validIndex(index,favourites))
            favourites.remove(index);
    }

    /**
     * Show list of favourites
     */
    public void listFavourites(){
        System.out.println("List of favourite musics:");
        int index=0;
        for(Music music : favourites){
            System.out.printf("%d) ",index);
            music.show();
        }
    }

    /**
     * Search for a music by name and singer and list all of founded music.
     * @param attribute Name or singer of the music
     */
    public void searchForMusic(String attribute){
        System.out.println("List of founded musics:");
        int index=0;
        for(Music music : files){
            String name = music.getName();
            String singer = music.getSinger();
            if(name.contains(attribute) || singer.contains(attribute)){
                System.out.printf("%d) ", index);
                music.show();
                index++;
            }
        }
    }
}