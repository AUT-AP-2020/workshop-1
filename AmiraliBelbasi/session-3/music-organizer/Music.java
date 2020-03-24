public class Music {
    private String musicAddress;
    private String musicSinger;
    private String musicReleaseYear;

    public Music(String musicAddress, String musicSinger, String musicReleaseYear) {
        this.musicAddress = musicAddress;
        this.musicSinger = musicSinger;
        this.musicReleaseYear = musicReleaseYear;
    }

    public String getMusicAddress() {
        return musicAddress;
    }
}