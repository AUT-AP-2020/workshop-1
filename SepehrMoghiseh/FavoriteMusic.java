import java.util.ArrayList;

/**
 * @throws class-FavoriteMusic a class to add music to favorite list.
 */
public class FavoriteMusic {
    ArrayList<Music>favoriteMusicList;
    public  FavoriteMusic(){
        favoriteMusicList=new ArrayList<>();
    }

    /**
     * add music
     * @param musicToAdd
     */
    public void addMusicFavorite(Music musicToAdd){
        favoriteMusicList.add(musicToAdd);
    }

    /**
     * remove music
     * @param musicToRemove
     */
    public void removeMusicFavorite(Music musicToRemove){
        favoriteMusicList.remove(musicToRemove);
    }
    public ArrayList<Music> getFavoriteMusicList() {
        return favoriteMusicList;
    }

    /**
     * print all of the musics
     */
    public void print(){
        for (int i = 0; i <favoriteMusicList.size() ; i++) {
            System.out.println(favoriteMusicList.get(i).getName());
        }
    }

}
