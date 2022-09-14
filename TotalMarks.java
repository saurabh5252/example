package com.Velocity;

public class TotalMarks {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Marathi = 80;
		int English = 75;
		int Science = 82;
		int Math = 78;
		int It = 50;
	    int Total = Marathi+English+Science+Math+It;
		int Average = Total/5; // No.of subject is 5

		System.out.println("Total Marks Of All Subjects : "+ Total);
		System.out.println("Average of Marks : " + Average);

	}

}
