package music;

public class SongInfo {
    private String name;
    private String singerName;
    private int publishYear;
    public SongInfo(String name , String singerName , int publishYear){
        this.name = name;
        this.singerName = singerName;
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getName() {
        return name;
    }

}
