public class Music {
    private String address;
    private int year;
    private String singer;
    public Music(String address, int year, String singer) {
        this.address = address;
        this.year = year;
        this.singer = singer;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    public void print(){
        System.out.println("Name: "+this.address+"Singer: "+this.singer+"Product year: "+this.year);
    }
}
