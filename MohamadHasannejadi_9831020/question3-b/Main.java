


public class Main{

    public static void main(String[] args) {
        MusicCollection pop = new MusicCollection(); 
        MusicCollection jazz = new MusicCollection(); 
        MusicCollection rock = new MusicCollection(); 
        MusicCollection country = new MusicCollection();
        Music music1 = new Music("Sarkoob", "Yas", 2010);
        Music music2 = new Music("Dr Dre", "DRE", 2016);
        rock.addFile(music1);
        rock.addFile(music2);
        //rock.listAllFiles();
        //rock.search("Eminem");
        rock.addFavorite(music1);
        rock.listFavorites();
    }
}