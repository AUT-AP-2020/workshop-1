
public class Music {
    private final String singerOfMusic;
    private final String nameOfMusic;
    private String address;
    private final int releaseYear;

    /**
     *
     * @param nameOfMusic will be the name of the music and it is final
     * @param singerOfMusic will be initialized and be final for singer
     * @param address will be initialized for the address
     * @param releaseYear will be initialized and be final for the release year
     */
    public Music(String nameOfMusic,String singerOfMusic, String address, int releaseYear) {
        this.nameOfMusic = nameOfMusic;
        this.singerOfMusic = singerOfMusic;
        this.address = address;
        this.releaseYear = releaseYear;
    }

    /**
     *
     * @return the address of the music
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address will be the new address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return return the singer name of the song
     */
    public String getSingerOfMusic() {
        return singerOfMusic;
    }

    /**
     *
     * @return the name of the music
     */
    public String getNameOfMusic() {
        return nameOfMusic;
    }

    /**
     *
     * @return the release year of the song
     */
    public int getReleaseYear() {
        return releaseYear;
    }

    /**
     * simply prints the music
     */
    public void print() {
        System.out.print("name of music: " + nameOfMusic + " ");
        System.out.println("singer : " + singerOfMusic
                + " release Year : " + releaseYear
                + " Address : " + address);
    }
}