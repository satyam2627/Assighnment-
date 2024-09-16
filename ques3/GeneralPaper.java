package ques3;

public class GeneralPaper extends WrittenItem{
	private int year;

	public GeneralPaper(int itemnum, String title, int numcopy, String author, int year) {
		super(itemnum, title, numcopy, author);
		this.setYear(year);
		
		
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
public void print() {
	System.out.println(toString()+"year: "+ year+ "author :"+getAuthor());


}	
		
	}
