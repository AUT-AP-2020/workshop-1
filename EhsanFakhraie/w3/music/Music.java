package music;


public class Music {
    private String name;
    private String singer;
    private String publishDate;

    public Music(String name, String singer, String publishDate) {
        this.name = name;
        this.singer = singer;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return name;    //To change body of overridden methods use File | Settings | File Templates.
    }
}
