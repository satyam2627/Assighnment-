package ques4;

public class SBaccount extends Account {
	
	static double interestrate =4;
	
public SBaccount(int amount) {
	
super(interestrate,amount);


}


public void print() {
	System.out.println(toString()+ " interest genrated: "+ calculateinterest());
}

public double calculateinterest() {
 return (double) ((getAmount()*interestrate)/100);
}
}