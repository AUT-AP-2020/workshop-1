package com.company;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 * @author David J. Barnes and Michael K�lling
 * @version 2011.07.31
 */
public class MusicCollection
{
    private ArrayList<Music> files;
    private ArrayList<Music> favorites;
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {
        files = new ArrayList<>();
        favorites = new ArrayList<>();
        player = new MusicPlayer();
    }

    /**
     * Add a music to the collection
     * @param singer the singer's name
     * @param publication the year this song published
     * @param Name the name of songs
     */
    public void addFile(String singer , String publication , String Name) { files.add(new Music (singer,publication,Name)); }

    /**
     * Add a music to the favorites
     * @param singer the singer's name
     * @param publication the year this song published
     * @param Name the name of songs
     */
    public void addFavorite(String singer , String publication , String Name) { favorites.add(new Music (singer,publication,Name)); }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for (int i=0 ; i<files.size() ; i++) {
            System.out.println(files.get(i).getName() + " by " + files.get(i).getSinger() + " in " + files.get(i).getPublication());
        }
    }

    /**
     * Show a list of all the favorite musics
     */
    public void favoriteList(){
        for (int i=0 ; i<favorites.size() ; i++) {
            System.out.println(favorites.get(i).getName() + " by " + favorites.get(i).getSinger() + " in " + favorites.get(i).getPublication());
        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        System.out.println(files.get(index).getName() + " by " + files.get(index).getSinger() + " in " + files.get(index).getPublication() + " removed from the playlist");
        files.remove(index);
    }

    /**
     * Remove a file from the favorite list.
     * @param index The index of the favorite to be removed.
     */
    public void removeFavorite(int index)
    {
        System.out.println(favorites.get(index).getName() + " by " + favorites.get(index).getSinger() + " in " + favorites.get(index).getPublication() + " removed from the playlist");
        favorites.remove(index);
    }

    /**
     * remove songs based on first char
     * @param a is the first char in song's name
     */
    public void removeSong(String a) {
        Iterator<Music> it = files.iterator();
        while (it.hasNext()) {
            Music t = it.next();
            if (t.getName().startsWith("a")) {
                System.out.println(it + " removed from playlist");
                it.remove();
            }
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if (validIndex(index) == true)
            System.out.println("The music is playing already");
        else
            player.startPlaying(files.get(index).getName() + " by " + files.get(index).getSinger() + " in " + files.get(index).getPublication());
    }

    /**
     * Stop the player.
     */
    public void stopPlaying(int index)
    {
        if (validIndex(index) == true)
            player.stop(files.get(index).getName() + " by " + files.get(index).getSinger() + " in " + files.get(index).getPublication());
        else
            System.out.println("The music is not playing at all");
    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index) { return player.getIsplaying(); }

    /**
     * Search a song in the collection
     * @param test is part of the song's Name that we want
     */
    public void searchName(String test){
        for (int i=0 ; i<files.size() ; i++){
            for (int j=0 ; j<test.length() ; j++){
                if(files.get(i).getName().substring(0,test.length()).equals(test) == true) {
                    System.out.println("THERE IS THIS SONG: " + files.get(i).getName() + " by " + files.get(i).getSinger() + " in " + files.get(i).getPublication());
                    break;
                }
            }
        }
    }

    /**
     * Search a song in the collection
     * @param test is part of the singer's Name that we want
     */
    public void searchSinger(String test){
        for (int i=0 ; i<files.size() ; i++){
            for (int j=0 ; j<test.length() ; j++){
                if(files.get(i).getSinger().substring(0,test.length()).equals(test) == true) {
                    System.out.println("THERE IS THIS SONG: " + files.get(i).getName() + " by " + files.get(i).getSinger() + " in " + files.get(i).getPublication());
                    break;
                }
            }
        }
    }

}