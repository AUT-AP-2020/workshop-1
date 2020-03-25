public class Music {
    String artist;
    String address;
    String releaseDate;
    String genre;

    public Music(String artist, String address, String releaseDate, String genre) {
        this.genre = genre;
        this.artist = artist;
        this.address = address;
        this.releaseDate = releaseDate;
    }
    public Music() {
        this.artist = null;
        this.address = null;
        this.releaseDate = null;
    }

    public void printMusic(){
        System.out.println(String.format("Address: %s | Artist: %s | Release Date: %s",address, artist, releaseDate));
    }




}
