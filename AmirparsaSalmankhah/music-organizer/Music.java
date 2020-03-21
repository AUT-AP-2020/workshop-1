package com.amirparsa.salmankhah;

import java.security.PublicKey;

/**
 * Represents a music with its name, singer and production year;
 *
 * @author Amirparsa Salmnakhah
 * @version 1.0
 */
public class Music {
    //Music name
    private String name;
    //Music singer
    private String singer;
    //Music production year
    private int productYear;

    /**
     * Constructor with no parameters
     */
    public Music() {
        this("","",0);
    }

    /**
     * Main constructor with 3 parameters;
     *
     * @param name        Music name
     * @param singer      Music singer
     * @param productYear Music production year
     */
    public Music(String name, String singer, int productYear) {
        this.name = name;
        this.singer = singer;
        this.productYear = productYear;
    }

    /**
     * Name getter
     *
     * @return Name of the music
     */
    public String getName() {
        return name;
    }

    /**
     * Name setter
     *
     * @param name Name of the music
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Singer getter
     *
     * @return Singer of the music
     */
    public String getSinger() {
        return singer;
    }

    /**
     * Singer setter
     *
     * @param singer Singer of the music
     */
    public void setSinger(String singer) {
        this.singer = singer;
    }

    /**
     * Production year getter
     *
     * @return Production year of the music
     */
    public int getProductYear() {
        return productYear;
    }

    /**
     * Production year setter
     *
     * @param productYear Production year of the music
     */
    public void setProductYear(int productYear) {
        this.productYear = productYear;
    }

    /**
     * Show Details
     */
    public void show(){
        System.out.println("Name: " + name + "\tSinger: " + singer + "\tProduction Year: " + productYear);
    }
}
