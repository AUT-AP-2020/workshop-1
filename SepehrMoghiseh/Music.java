public class Music {
    private String name;
    private String SingerName;
    private int yearReleased;
    public Music(String name,String singerName,int yearReleased){
        this.name=name;
        this.SingerName=singerName;
        this.yearReleased=yearReleased;
    }

    public String getName() {
        return name;
    }

    public int getYearReleased() {
        return yearReleased;
    }

    public String getSingerName() {
        return SingerName;
    }
}
