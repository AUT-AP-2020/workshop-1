/**
 * well first off
 * we should tell you about the category
 * the category[0] is pop
 * the category[1] is rap
 * the category[2] is classic
 * the category[3] is country
 * the category [4] is favorite
 * @author Sina
 * @version 2.2
 */
public class main {
    public static void main(String []args)
    {
        MusicCollection [] category=new MusicCollection[5];
        Music song1=new Music("/users/apple/desktop/music/","heyyou ","pinkfloyd ",2019);
        Music song2=new Music("/users/apple/desktop/music/","hotelcalifornia","eagles",2017);
        Music song3=new Music("/users/apple/desktop/music/","dumb","nirvana",2018);
        Music song4=new Music("/users/apple/desktop/music/","globalwarming","gojira",2017);
        Music song5=new Music("/users/apple/desktop/music/","wareternal","archenemy",2015);
        for(int i=0;i<5;i++)
        {
            category[i]=new MusicCollection();
        }
        category[0].addFile(song1);
        category[0].addFile(song4);
        category[1].addFile(song2);
        // category [4] is the favorite section then i treat it like its music collection :0
        category[4].addFile(song1);
        category[4].addFile(song2);
        category[4].addFile(song3);
        category[4].addFile(song4);
        category[4].addFile(song5);
        //im removing the last song ive added to the favourite
        category[4].removeFile(5);
        //searching for a specific name even if that artist or the name of the song
        category[4].search("hope");
        //well now want the first song to play
        category[4].startPlaying1(1);
        //now the song should stop !
        category[4].stopPlaying();

    }
}
