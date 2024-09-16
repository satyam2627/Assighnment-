package ques3;

public class Video  extends MediaItem{
private String Director;
private String genre;
private int yearreleased;
public Video(int itemnum, String title, int numcopy,int runtime,String Director, String genre, int yearreleased) {
	super(itemnum,title,numcopy,runtime);
	this.setDirector(Director);
	this.setGenre(genre);
	this.setYearreleased(yearreleased);
	
	
}
public String getDirector() {
	return Director;
}
public void setDirector(String director) {
	Director = director;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYearreleased() {
	return yearreleased;
}
public void setYearreleased(int yearreleased) {
	this.yearreleased = yearreleased;
}

public void print() {
System.out.println(toString()+ "Director :" +getDirector()+" genre "+ getGenre()+ " year released "+ getYearreleased());
}
};