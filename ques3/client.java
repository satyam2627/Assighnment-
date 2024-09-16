package ques3;

import java.util.Scanner;

public class client {
	public static void main(String args[]) {
//		Book b = new Book(11,"hellojava",10,"satyam");
//		b.print();
//		b.checkin();
//		b.print();
//		GeneralPaper gp = new GeneralPaper(12,"letusC",12,"AMit",2003);
//		
//		gp.print();
//		gp.checkin();
//		gp.print();
		
		Video vd = new Video(13,"codewithme",15,10,"ss","classical",2003);
		vd.print();
		vd.checkout();
		vd.print();
		CD cd = new CD(18,"copyofcd",11,10,"sat","romcom");
		cd.print();
		cd.checkin();
		cd.print();
	}
}
