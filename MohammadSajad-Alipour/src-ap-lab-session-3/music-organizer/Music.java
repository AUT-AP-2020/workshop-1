import java.util.Objects;

public class Music {
    private String fileAddress;
    private String singerName;
    private String releaseYear;

    public Music(String fileAddress,String singerName,String releaseYear){
        this.fileAddress=fileAddress;
        this.singerName=singerName;
        this.releaseYear=releaseYear;

    }

    public void print(){
        System.out.println("File Address : "+fileAddress);
        System.out.println("Singer : "+singerName);
        System.out.println("Year : "+releaseYear);
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public String getSingerName() {
        return singerName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Music music = (Music) o;
        return Objects.equals(fileAddress, music.fileAddress) &&
                Objects.equals(singerName, music.singerName) &&
                Objects.equals(releaseYear, music.releaseYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileAddress, singerName, releaseYear);
    }
}
