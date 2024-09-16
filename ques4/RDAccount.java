package ques4;

public class RDAccount extends Account  {
	static double RDinterestrate =6;
	public RDAccount(double amount, int numofmonth, int monthlyamount,int age) throws Validation{
		 
		super(RDinterestrate,amount);
		if(age<18) {
			throw new Validation("Enter valid age");
		}
		if(age>60) {
			if(numofmonth>=21) {
			RDinterestrate = 9.25;
		}
			else if(numofmonth==18) {
				RDinterestrate = 9.0;
			}
			else if(numofmonth==15) {
				RDinterestrate = 8.75;
			}
			else if(numofmonth==12) {
				RDinterestrate = 8.50;
				
			}
			else if(numofmonth==9) {
				RDinterestrate = 8.25;
			}
			else {
				RDinterestrate = 8.00;
			}
	}
		else {
			if(numofmonth>=21) {
				RDinterestrate = 8.75;
			}
				else if(numofmonth==18) {
					RDinterestrate = 8.50;
				}
				else if(numofmonth==15) {
					RDinterestrate = 8.25;
				}
				else if(numofmonth==12) {
					RDinterestrate = 8.0;
					
				}
				else if(numofmonth==9) {
					RDinterestrate = 7.75;
				}
				else {
					RDinterestrate = 7.50;
				}	
		}
}
	
	public double calculateinterest() {
		 return (double) ((getAmount()*RDinterestrate)/100);
		}
	public void print() {
		System.out.println("interestrate : "+RDinterestrate+ ", amount :"+getAmount()+ ", Interest gained is : "+calculateinterest());
	}
	
	
	
}
