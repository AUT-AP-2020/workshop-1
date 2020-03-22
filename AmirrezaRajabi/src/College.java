import java.util.ArrayList;
/**  The College class represents a college in a College
 administration system.
 * It holds the College details relevant in our context.
 * @author Amirreza
 * @version 1.0
 */
public class College
{
    //name of college
    private String name;
    //code of college (ce:31)
    private String code;
    //vector of labs of college
    private ArrayList<Lab> labs;
    /**
     * Create a new College with a given name.
     * @param name  name of College
     */
    public College(String name)
    {
        this.name = name;
        labs = new ArrayList<Lab>();
    }
    /**
     * check the lab can be in college
     *  @param lab check can be in college
     */
    public int check(Lab lab)
    {
        if (code.equals(lab.getCode().substring(0,2)))
            return 1;
        return 0;
    }
    public void print()
    {
        for (int i = 0;i<labs.size();i++)
        {
            labs.get(i).print();
        }
    }
    /**
     * add lab to labs
     *  @param labToAdd lab might be added
     */
    public void addLab(Lab labToAdd)
    {
        int j = 0;
        for (int i = 0 ; i < labs . size();i++)
        {
            if (labToAdd.getDay().equals(labs.get(i).getDay()))
                j = j+1;
        }
        if ( j == 0)
            labs.add(labToAdd);
        if ( j != 0)
            System.out.println("lab was existing");
    }
    /**
     * remove lab of labs
     *  @param labToRemove lab might be removed
     */
    public void removeLab(Lab labToRemove)
    {
        int j = 0;
        for (int i = 0 ; i < labs . size();i++)
        {
            if (labToRemove.getDay().equals(labs.get(i).getDay()))
                j = j+1;
        }
        if ( j == 1)
            labs.remove(labToRemove);
        if ( j == 0)
            System.out.println("lab was not existing");
    }
}
