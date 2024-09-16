package ques4;

public class mainn {
public static void main(String args[]) {
SBaccount sb = new SBaccount(2000);
//sb.print();

try {
	FDAccount fd = new FDAccount(10000,91,33);
	fd.print();
} 
catch (Validation e) {
	
	System.out.println(e.getMessage());
}

//
RDAccount rd;
try {
	rd = new RDAccount(1000,9,100,91);
	rd.print();
} catch (Validation e) {
	
	System.out.println(e);
}


}
}
