import java.util.*;

import jdk.nashorn.internal.ir.WhileNode;
class MusicCollection
{
   private  ArrayList <String> files=new ArrayList<String>();
   private  ArrayList <String> artists=new ArrayList<String>();
   private  ArrayList <String> year=new ArrayList<String>();
   private  ArrayList <String> myfavorites=new ArrayList<String>();
   
   /**
    * @param file is the location of the file;
    */
   public void remover()
   {
       Iterator<String> it=files.iterator();
       boolean done=false; // to check if there wastent such that file;
       Scanner fScanner=new Scanner(System.in);
       System.out.println("please enter the address of the music file");
       String file=fScanner.nextLine();
       while (it.hasNext())
       {
            String temp=it.next();
            if (temp.equals(file))
            {
                done=true;
                it.remove();    
                System.out.println("removed");
                break;
            } 
       }
       if (!done)
       {
        System.out.println("There is no music like that to remove");    
       }
   }
   
   /**
    * just print the list in order;
    */
   public void print ()
   {
        int i=0;       
        for (String temp : files) 
        {
            System.out.println("["+i+"]" +temp+" by-> "+artists.get(i)+ " at "+year.get(i));
            i++;
        }     
   }

   /**
    * 
    *  @param file is the name of the music file
    *  @param atrist is the atrist of the music
    *  @param year is the year of the music 
    */
   public void add()
    {
        String file;
        String artist;
        String year;
        Scanner fScanner=new Scanner(System.in);
        System.out.println("Please enter the address and artist and the year of the music to add(each at seprate line)");
        file=fScanner.nextLine();
        artist=fScanner.nextLine();
        year=fScanner.nextLine();
        files.add(file);
        artists.add(artist);
        this.year.add(year);
    }
   public void searcher() 
   {
        Scanner fScanner=new Scanner(System.in);
        System.out.println("please enter the name or adress of your music");
        String sign=fScanner.nextLine();
        boolean exist=false;//to check it wasnt exist;
        int i=0;
        for (String temp : artists)
        {
            String temp2=artists.get(i);
            if (temp.equals(sign) || temp2.equals(temp))
            {
                System.out.println(i+":"+files.get(i)+" by ->"+artists.get(i)+" at "+year.get(i));
                exist=true;
                break;    
            }    
            i++;
        }
        if (!exist)
        {
            System.out.println("theres is no such that file");    
        }
   } 

   public void add_to_favorite()
    {
        Scanner fscaScanner=new Scanner(System.in);
        
        boolean exist=false;
        System.out.println("enter the file name of your music ypu want to add to favorits");
        String file=fscaScanner.nextLine();
        for (String temp : files)
        {
            if (temp.equals(file))
            {
                myfavorites.add(file);
                exist=true;
                break;
            }    
        }
        if (!exist)
        {
            System.out.println("There isnt such that file in this field");    
        }
    }

    public void remove_to_favorite()
    {
        Scanner fscaScanner=new Scanner(System.in);
        boolean exist=false;
        System.out.println("enter the file name of your music ypu want to remove to favorits");
        String file=fscaScanner.nextLine();
        Iterator <String> it=myfavorites.iterator();
        while (it.hasNext()) 
        {
            String temp=it.next();
            if (temp.equals(file))
            {
                exist=true;
                it.remove();
                break;
            }    
        }
        if (!exist)
        {
            System.out.println("There isnt such that file in this field");    
        }
    }

    public void show_favorites()
    {
        for (String temp : myfavorites)
        {
            System.out.println(temp);    
        }    
    }

}



/**
 * Run is a Class to run the project
 */
 class Run 
{
    private static MusicCollection pop=new MusicCollection();
    private static MusicCollection rock=new MusicCollection();
    private static MusicCollection jass=new MusicCollection();
    private static MusicCollection country=new MusicCollection();
    
    public static void main(String[] args) 
    {
        Scanner fScanner=new Scanner(System.in);
        int i;
        while (true)
        {
            System.out.println("enter the genre :");
            System.out.println("1)Pop\n2)Rock\n3)Jass\n4)Country");
            i=fScanner.nextInt();
            switch (i) {
                case 1:
                    System.out.println("1)Add Music\n2)Remove Music\n3)Show all Music\n4)Search\n5)Add to favorie\n6)"+
                    "Remove favorite\n7)Show favorites");
                    i=fScanner.nextInt();
                    switch (i) {
                        case 1:
                            pop.add();
                            break;
                        case 2:
                            pop.remover();
                            break;
                        case 3:
                            pop.print();
                            break;
                        case 4:
                            pop.searcher();;
                            break;
                        case 5:
                            pop.add_to_favorite();
                            break;
                        case 6:
                            pop.remove_to_favorite();
                            break;
                        case 7: 
                            pop.show_favorites();
                            break;
                    }
                    break;
            
            case 2:
                System.out.println("1)Add Music\n2)Remove Music\n3)Show all Music\n4)Search\n5)Add to favorie\n6)"+
                "Remove favorite\n7)Show favorites");
                i=fScanner.nextInt();
                switch (i) {
                    case 1:
                        rock.add();
                        break;
                    case 2:
                        rock.remover();
                        break;
                    case 3:
                        rock.print();
                        break;
                    case 4:
                        rock.searcher();;
                        break;
                    case 5:
                        rock.add_to_favorite();
                        break;
                    case 6:
                        rock.remove_to_favorite();
                        break;
                    case 7: 
                        rock.show_favorites();
                        break;
                        }
                break;
            case 3:
            System.out.println("1)Add Music\n2)Remove Music\n3)Show all Music\n4)Search\n5)Add to favorie\n6)"+
            "Remove favorite\n7)Show favorites");
            i=fScanner.nextInt();
            switch (i) {
                case 1:
                    jass.add();
                    break;
                case 2:
                    jass.remover();
                    break;
                case 3:
                    jass.print();
                    break;
                case 4:
                    jass.searcher();;
                    break;
                case 5:
                    jass.add_to_favorite();
                    break;
                case 6:
                    jass.remove_to_favorite();
                    break;
                case 7: 
                    jass.show_favorites();
                    break;
            }
            break;
            case 4:
            System.out.println("1)Add Music\n2)Remove Music\n3)Show all Music\n4)Search\n5)Add to favorie\n6)"+
            "Remove favorite\n7)Show favorites");
            i=fScanner.nextInt();
            switch (i) {
                case 1:
                    country.add();
                    break;
                case 2:
                    country.remover();
                    break;
                case 3:
                    country.print();
                    break;
                case 4:
                    country.searcher();;
                    break;
                case 5:
                    country.add_to_favorite();
                    break;
                case 6:
                    country.remove_to_favorite();
                    break;
                case 7: 
                    country.show_favorites();
                    break;
            }
            break;
            }    
        }    
    }
    
}