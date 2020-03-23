package LAB3;

public class Music {
    private final String singer;
    private final String name;
    private String address;
    private final int releaseYear;

    /**
     *
     * @param singer will be initialized and be final for singer
     * @param address will be initialized for the address
     * @param releaseYear will be initialized and be final for the release year
     * @param name will be the name of the music and it is final
     */
    public Music(String singer, String address, int releaseYear, String name) {
        this.singer = singer;
        this.name = name;
        this.address = address;
        this.releaseYear = releaseYear;
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
     * @return the address of the music
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @return the name of the music
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return return the singer name of the song
     */
    public String getSinger() {
        return singer;
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
        System.out.print("Name: " + this.name + " ");
        System.out.println("Singer : " + this.singer + " release Year : " + this.releaseYear + " Address : " + this.address);
    }
}
