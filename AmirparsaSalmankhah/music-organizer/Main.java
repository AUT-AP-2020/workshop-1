package com.amirparsa.salmankhah;

public class Main {

    public static void main(String[] args) {
	    MusicCollection jazz = new MusicCollection();
	    jazz.addFile("salam");
	    jazz.addFile("khoobi?");
	    jazz.addFile("khoobam");
        jazz.startPlaying(3);
        jazz.startPlaying(2);
        jazz.stopPlaying();
        jazz.listAllFiles();
        jazz.removeFile(1);
        jazz.listAllFiles();
        jazz.listFile(1);
    }
}
