public class Music {
    private String musicAddress;
    private String musicSinger;
    private String musicReleaseYear;

    public Music(String musicAddress, String musicSinger, String musicReleaseYear) {
        this.musicAddress = musicAddress;
        this.musicSinger = musicSinger;
        this.musicReleaseYear = musicReleaseYear;
    }

    /**
     * @return the musicAddress
     */
    public String getMusicAddress() {
        return musicAddress;
    }

    /**
     * @return the musicReleaseYear
     */
    public String getMusicReleaseYear() {
        return musicReleaseYear;
    }

    /**
     * @return the musicSinger
     */
    public String getMusicSinger() {
        return musicSinger;
    }
}