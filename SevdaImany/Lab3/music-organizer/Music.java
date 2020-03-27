public class Music{
    private final String name;
    private final String singerName;
    private final String address;
    private int releaseYear;
    //zero if music is liked otherwise -1
    private int likedMusic;
    

    public Music(String name, String singerName, String address, int releaseYear) {
        this.name = name;
        this.singerName = singerName;
        this.address = address;
        this.releaseYear = releaseYear;
        likedMusic = -1;
    }

    public void print(){
        System.out.println("music name : " + name + " singer name : "+ singerName + " music address :  "+ address + " release year :" + releaseYear);
    }

    public String getName() {
        return name;
    }

    public int getLikedMusic() {
        return likedMusic;
    }

    public void setLikedMusic(int likedMusic) {
        this.likedMusic = likedMusic;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getAddress() {
        return address;
    }
    
}