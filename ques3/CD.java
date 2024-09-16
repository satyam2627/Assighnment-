package ques3;

public class CD extends MediaItem {
	
	private String artist;
	private String genre;
public CD(int itemnum, String title, int numcopy,int runtime, String artist, String genre){
	super(itemnum,title,numcopy,runtime);
	this.setArtist(artist);
	this.setGenre(genre);
	
	
	
}
	
	
	
	
public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void print() {
		System.out.println(toString()+ "Artist :" +getArtist()+" genre "+ getGenre());
		}





}
