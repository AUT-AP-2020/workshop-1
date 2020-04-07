public class MusicFile {
    private String singer;
    private String year;
    private String fileAddress;
    public MusicFile(String singer, String year, String fileAddress){
        this.fileAddress = fileAddress;
        this.singer = singer;
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getFileAddress() {
        return fileAddress;
    }

    public void setFileAddress(String fileAddress) {
        this.fileAddress = fileAddress;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }
}
