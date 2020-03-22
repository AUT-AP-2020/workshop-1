import java.util.ArrayList;

public class MusicOrganizer 
{
	private ArrayList<String> tracks;
	tracks = new ArrayList<String>();

	public void removeTrack(String nameLike)
	{
		for (int i = 0; i < tracks.size(); i++)
			if(tracks.get(i).equals(nameLike))
				tracks.remove(i);
	}
}