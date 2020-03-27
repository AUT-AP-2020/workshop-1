package com.company;

import java.util.ArrayList;

/**
 * Music class represents the information of every songs
 * @author Rajabi2001
 */
public class Music {

    private String singer;
    private String publication;
    private String Name;

    /**
     * creat a Music object
     */
    public Music(String singer , String publication , String Name) {
        this.Name = Name;
        this.singer = singer;
        this.publication = publication;
    }

    public String getName(){return Name; }

    public String getPublication(){return publication; }

    public String getSinger(){return singer; }
}
