package com.masai;

class SimpleInterest{
	double pricipalAmount;
	double timePeriod;
	double interestRate;
	
	void setValues(double pa, double tp, double ir){
	    //write code to assign value here
		pricipalAmount=pa;
		timePeriod=tp;
		interestRate=ir;
		
	}
	
	double getInterestAmount(){
	    //write code to computer and return the interest amount rounded to two decimal places
		double interest= (pricipalAmount*timePeriod*interestRate)/100;
		return interest;
	}
	
}

public class SimpleInterestTester {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest siOne = new SimpleInterest();
        SimpleInterest siTwo = new SimpleInterest();
         siOne.setValues(1005, 2, 7.5);
         siTwo.setValues(1235.50, 2.5, 8.25);
         
         double x= siOne.getInterestAmount();
         double ans1=(Math.round(x * 100))/100.0;
         double y= siTwo.getInterestAmount();
         double ans2=(Math.round(y * 100))/100.0;
         
         System.out.println("Simple Interest amount for siOne id "+ans1);
         System.out.println("Simple Interest amount for siTwo id "+ans2);
 		
	}

}
