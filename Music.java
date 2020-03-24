public class Music{
    private String file;
    private String singerName;
    private int year=0;
    private boolean isFav=false;

    public Music(String file, String singerName, int year){
        this.file=file;
        this.singerName=singerName;
        this.year=year;
    }

    public int getYear(){
        return year;
    }

    public String getFileAddress(){
        return file;
    }

    public String getSingerName(){
        return singerName;
    }

    public boolean getIsFav(){
        return isFav;
    }

    public void setFav(boolean isFav) {
        this.isFav = isFav;
        return;
    }

    public void printinfo(){
        System.out.println("file addres is: "+ this.file);
        System.out.println("singer name is: "+ this.singerName);
        System.out.println("year of production is: "+ this.year);
        return;
    }

}