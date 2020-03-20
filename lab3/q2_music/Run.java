import java.util.*;


/**
 * purpose: a simple musicPlayer which even doesnt play a song :)  just prints some messages like "its playing..." .
 * @author farzad Radnia.
 * @version 1.0  ( 11.3.2020 )
 */
public class Run {

    // the collections that we have
    private static ArrayList<MusicCollection> collections = new ArrayList<MusicCollection>();


    /**
     * prints the main menu of program.
     */
    public static void printMainMenu ()
    {
        System.out.println("\n1- enter to a collection\n" +
                           "2- add a new collection\n" +
                           "3- remove a collection\n" +
                           "4- show the collection list\n"+
                           "5- exit");
    }


    /**
     * prints the collection menu
     */
    public static void printCollectionMenu ()
    {
        System.out.println( "\n1- print all songs \n" +
                            "2- play a song \n" +
                            "3- stop playing \n" +
                            "4- add a song \n" +
                            "5- remove a song \n" +
                            "6- search a song \n" +
                            "7- add a song to favorites \n" +
                            "8- back to collections");
    }

    /**
     * prints all collections  we have with amount of their songs.
     */
    public static void printCollections()
    {
        int counter = 1;
        for(MusicCollection collection : collections) {
            System.out.println(counter + "- " + collection.getName() + " : " + collection.getNumberOfSongs() + " songs");
            counter ++;
        }
    }


    /**
     * makes and adds a new collection by required information inside the it from user.
     */
    public static void addCollection()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the name of collection");
        String name = scan.nextLine();

        MusicCollection newCollection = new MusicCollection(name);
        collections.add(newCollection);
        System.out.println(name + " added.");
    }


    /**
     * remove a collection from the collections list and print which collection got removed.
     * getting and checking validate of collection's index is inside the method
     */
    public static void removeCollection()
    {
        printCollections();
        System.out.println("choose collection");
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt() - 1;
        if(index >= 0 && index < collections.size())
        {
            System.out.println(collections.get(index).getName() + " deleted.");
            collections.remove(index);

        }
        else
            System.out.println("not valid index");
    }


    /**
     * make a song object by required information inside the method.
     * @return Song: the song object has been made.
     */
    public static Song makeSong ()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter song name (file name).");
        String name = scan.nextLine();
        System.out.println("enter singer");
        String singer = scan.nextLine();
        System.out.println("enter year of release");
        int year =scan.nextInt() - 1900; // i dont know why the date's mainTime is the year 1900.
        System.out.println("enter the month of release");
        int month = scan.nextInt() - 1; // its counted from 0 i guss.
        System.out.println("enter the day of release");
        int day = scan.nextInt();

        return  new Song(name,singer,new Date(year,month,day));
    }

    /**
     * adds a song to favorite collection. if the song has been already in favorites it would print an error.
     * finding the song is in the method by asking  index from user and check it.
     * @param currentCollection the collection which the songs belongs to.
     */
    public static void addToFavorite(MusicCollection currentCollection)
    {
        Scanner scan = new Scanner(System.in);
        currentCollection.listAllSongs();
        System.out.println("choose a song");
        int indexSongFavorite = scan.nextInt() - 1;

        if(indexSongFavorite >= 0 && indexSongFavorite < currentCollection.getNumberOfSongs() ) //checks validate
        {
            for(MusicCollection tempCollection : collections)
                if(tempCollection.getName().contains("#favorite#")) // finds the favorite collection.
                {
                    // checks if the song was in the favorites before.
                    if (!tempCollection.getSongs().contains(currentCollection.getSongs().get(indexSongFavorite)))
                        tempCollection.addSong(currentCollection.getSongs().get(indexSongFavorite));

                    else
                        System.out.println("this song has been in favorites before !");
                }
        }
        else
            System.out.println("not valid index !");
    }



    public static void main(String[] args) {

        //making the songs
        Song song1 = new Song("file1","singer1", new Date(100, Calendar.JANUARY, 1));
        Song song2 = new Song("file2","singer2", new Date(100, Calendar.JANUARY, 2));
        Song song3 = new Song("file3","singer3", new Date(100, Calendar.JANUARY, 3));
        Song song4 = new Song("file4","singer4", new Date(100, Calendar.JANUARY, 4));
        Song song5 = new Song("file5","singer5", new Date(100, Calendar.JANUARY, 5));
        Song song6 = new Song("file6","singer6", new Date(100, Calendar.JANUARY, 6));
        Song song7 = new Song("file7","singer7", new Date(100, Calendar.JANUARY, 7));
        Song song8 = new Song("file8","singer8", new Date(100, Calendar.JANUARY, 8));
        Song song9 = new Song("file9","singer9", new Date(100, Calendar.JANUARY, 9));
        Song song10 = new Song("file10","singer10", new Date(100, Calendar.JANUARY, 10));


        MusicCollection rock = new MusicCollection("rock", song1,song2,song9);
        MusicCollection pop = new MusicCollection("pop", song3,song4,song10);
        MusicCollection jaz = new MusicCollection("jaz", song5,song6);
        MusicCollection country = new MusicCollection("country", song7,song8);
        MusicCollection favorite = new MusicCollection("#favorite#", song2, song8, song4, song5);
        collections.add(rock);
        collections.add(pop);
        collections.add(jaz);
        collections.add(country);
        collections.add(favorite);

        Scanner scan = new Scanner(System.in);
        int oper = 0;

        while (oper != 5) // main menu
        {
            printMainMenu();
            oper = scan.nextInt();
            scan.nextLine();

            switch (oper)
            {

                case 1: // enter a collection.

                    System.out.println("choose the collection");
                    printCollections();
                    int index = scan.nextInt() - 1;
                    scan.nextLine();

                    if(index >= 0 && index <collections.size() ) // checks if the index is valid
                    {
                        MusicCollection currentCollection = collections.get(index);
                        int oper2 = 0;

                        while (oper2 != 8) // collection menu
                        {
                            printCollectionMenu();
                            oper2 = scan.nextInt();
                            scan.nextLine();

                            switch (oper2)
                            {

                                case 1: // show all songs
                                    currentCollection.listAllSongs();
                                    break;

                                case 2: // play a song
                                    currentCollection.listAllSongs();
                                    System.out.println("choose the song");
                                    int indexSong = scan.nextInt() - 1;
                                    scan.nextLine();
                                    System.out.println(indexSong);
                                    currentCollection.startPlaying(indexSong);
                                    break;

                                case 3: // stop playing
                                    currentCollection.stopPlaying();
                                    break;


                                case 4: //add song
                                    currentCollection.addSong( makeSong() );
                                    break;

                                case 5: // remove a song
                                    currentCollection.listAllSongs();
                                    System.out.println("choose the song");
                                    int indexSongRemove = scan.nextInt() - 1;
                                    scan.nextLine();
                                    currentCollection.removeSong(indexSongRemove);
                                    break;

                                case 6: //search for a song
                                    System.out.println("enter name of song or singer");
                                    String name = scan.nextLine();
                                    currentCollection.searchSong(name);
                                    break;

                                case 7: // add a song to favorite collection
                                   addToFavorite(currentCollection);

                            }// end of switch .
                        }// end of while
                    } // end of checking validate of index.
                    else
                        System.out.println("not valid index.");
                    break; // end of case 1.


                case 2: // add a collection
                    addCollection();
                    break;

                case 3:
                    removeCollection();
                    break;

                case 4:  // print all collections
                    printCollections();
                    break;

            }// end of main switch
        }// end of main wail.
    }// end of main method

}
