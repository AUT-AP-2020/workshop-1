/** a class formusic
 */
public class Music {
    //address of music
    private String address;
    //name of singer
    private String singer;
    private int year;

    /** create a new music
     *
     * @param address filename
     * @param name name of singer
     * @param year
     */
    public Music(String address , String name , int year)
    {
        this.address = address;
        this . singer = name;
        this.year=year;
    }

    /** get the name of music
     * @return address
     */
    public String getAddress()
    {
        return address;
    }
    /** get the name  singer of music
     * @return singer
     */
    public String getSinger()
    {
        return singer;
    }
    /** get the yrar of music
     * @return year
     */
    public int getYear()
    {
        return year;
    }
    public void print()
    {
        System.out.println("address: "+address + " singer: "+ singer +" yeaar: " + year);
    }
}
