public class Music {
    private String filename;
    private int year;
    private String  singer;

    Music(String f, int y, String  s){
        filename = f;
        year = y;
        singer = s;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Music))
            return false;
        Music m = (Music) obj;
        return filename == m.filename && singer == m.singer && year == m.year;
    }

    public String toString(){
        return "Singer: " + singer + " Year: " + year + " Filename: " + filename;
    }
}
