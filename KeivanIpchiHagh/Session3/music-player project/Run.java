class Run {

    public static void main(String[] args) {

        MusicCollection pop = new MusicCollection("pop_playList");
        MusicCollection jazz = new MusicCollection("jazz_playList");
        MusicCollection rock = new MusicCollection("rock_playList");
        MusicCollection country = new MusicCollection("country_playList");

        MusicCollection favorite = new MusicCollection("favorite_playList");

        Music music1 = new Music("Miss Americana & The Heartbreak Prince", "Taylor Swift", "2019");
        Music music2 = new Music("Delicate", "Taylor Swift", "2017");
        Music music3 = new Music("Comfortably Numb", "Pink Floyed", "1979");
        Music music4 = new Music("Country Girl", "Jessie Buckley", "2019");

        pop.addMusic(music1);
        pop.addMusic(music2);
        pop.addMusic("bellyache", "Billy Eilish", "2017");

        country.addMusic(music4);

        jazz.addMusic("Goodbye My Lover", "james Blunt", "2004");

        rock.addMusic(music3);
        rock.addMusic("Beautiful", "Apocalyptica", "2015");

        // Print Collection - TEST
        pop.print();
        System.out.println("\n");

        // Searh Collection - TEST
        rock.search("Beautiful");
        rock.search("lover");
        System.out.println("\n");
        
        // Add to favorite playlist - TEST
        favorite.addMusic(music2);

        // Print Collection - TEST
        favorite.print();
        System.out.println("\n");
    }
}