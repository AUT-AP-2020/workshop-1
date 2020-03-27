

public class Main {
	
	public static void main(String[] args) {
		MusicCollection categories[] = new MusicCollection[4];
		for(int i=0;i<categories.length;i++) categories[i] = new MusicCollection();
		
		categories[0].addFile(new Music("C:\\Users\\me\\Musics\\pop\\1-home.mp3", "Robot-1", 1989));
		categories[0].addFile(new Music("C:\\Users\\me\\Musics\\pop\\2-home.mp3", "Robot-1", 1986));
		categories[0].addFile(new Music("C:\\Users\\me\\Musics\\pop\\13.mp3", "Robot-2", 1985));
		categories[0].addFile(new Music("C:\\Users\\me\\Musics\\pop\\14-home.mp3", "Robot-3", 1984));
		categories[1].addFile(new Music("C:\\Users\\me\\Musics\\jazz\\3.mp3", "Robot-21", 1996));
		categories[1].addFile(new Music("C:\\Users\\me\\Musics\\jazz\\4.mp3", "Robot-13", 1990));
		categories[2].addFile(new Music("C:\\Users\\me\\Musics\\rock\\5.mp3", "Robot-144", 1989));
		categories[2].addFile(new Music("C:\\Users\\me\\Musics\\rock\\6.mp3", "Robot-124", 1989));
		categories[3].addFile(new Music("C:\\Users\\me\\Musics\\country\\7.mp3", "Robot-1441", 1980));
		categories[3].addFile(new Music("C:\\Users\\me\\Musics\\country\\8.mp3", "Robot-1223", 1982));
		
		categories[0].addFavorite(1);
		categories[0].addFavorite(2);
		
		categories[0].listFavorites();
		categories[0].removeFavorite(0);
		categories[0].listFavorites();
		categories[0].removeFavorite(categories[0].getTrack(2));
		categories[0].listFavorites();
		
		categories[0].listAllFiles();
		
		categories[1].listAllFiles();
		
		categories[0].search("home");
	}
}
