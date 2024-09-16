package ques4;

public class FDAccount extends Account{
	static double FDinterestrate =4;
public FDAccount(int amount,int numofday, int age)throws Validation  {
	
	
	super(FDinterestrate,amount);
	if(age<18) {
		throw new Validation("Enter valid age");
	}
	
	if(amount<10000000) {
		if(age<60) {
			if(numofday>=185 && numofday<=365 ) {
				FDinterestrate = 8.0;
			}
			else if(numofday>=61&& numofday<=184) {
				FDinterestrate = 7.5;
			}
			else if(numofday>=45&& numofday<=60) {
				FDinterestrate = 7.0;
			}
			else if(numofday>=30&& numofday<=44) {
				FDinterestrate = 5.50;
			
			}
			else if(numofday>=15&& numofday<=29) {
				FDinterestrate = 4.75;
			
			}
			else {
			FDinterestrate = 4.50;
			}	
			
		}
		else {
			if(numofday>=185 && numofday<=365 ) {
				FDinterestrate = 8.5;
			}
			else if(numofday>=61&& numofday<=184) {
				FDinterestrate = 8.0;
			}
			else if(numofday>=45&& numofday<=60) {
				FDinterestrate = 7.5;
			}
			else if(numofday>=30&& numofday<=44) {
				FDinterestrate = 6.0;
			
			}
			else if(numofday>=15&& numofday<=29) {
				FDinterestrate = 5.25;
			
			}
			else {
			FDinterestrate = 5.0;
			}	
			
		}
	}
	else {
		if(numofday>=185&& numofday<=365) {
			FDinterestrate = 10.0;
		}
		else if(numofday>=61&& numofday<=184) {
			FDinterestrate = 8.5;
		}
		else if(numofday>=45&& numofday<=60) {
			FDinterestrate = 8.0;
		}
		else if(numofday>=30&& numofday<=44) {
			FDinterestrate = 6.75;
		
		}
		else if(numofday>=15&& numofday<=29) {
			FDinterestrate = 6.75;
		
		}
		else {
		FDinterestrate = 6.50;
		}	
		
	}
	
}


public double calculateinterest() {
	 return (double) ((getAmount()*FDinterestrate)/100);
	}


public void print() {
	System.out.println("interestrate : "+FDinterestrate+ ", amount :"+getAmount()+ ", Interest gained is : "+calculateinterest());
}
}
