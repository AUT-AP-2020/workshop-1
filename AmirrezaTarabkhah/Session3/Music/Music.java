public class Music {

    private String name;
    private String singer;
    private String releaseDate;

    public Music(String mname, String msinger, String mrealeseDate)
    {
        name = mname;
        singer = msinger;
        releaseDate = mrealeseDate;
    }

    public void print()
    {
        System.out.println("Music name: " + name);
        System.out.println("Music singer: " + singer);
        System.out.println("Music release date: " + releaseDate);
    }

    public String getName() {return name;}
}
