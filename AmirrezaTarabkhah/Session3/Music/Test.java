public class Test
{
	public static void main(String[] arg)
	{
		MusicCollection pop = new MusicCollection();
		MusicCollection jazz = new MusicCollection();
		MusicCollection rock = new MusicCollection();
		MusicCollection country = new MusicCollection();
		Music bill = new Music("Blli jeans", "Micheal Jackson", "1990");
		Music like = new Music("Smelll like a teen spirit", "Nirvana", "2005");
		pop.addFile(bill);
		rock.addFile(like);
		rock.startPlaying(1);
	}
}