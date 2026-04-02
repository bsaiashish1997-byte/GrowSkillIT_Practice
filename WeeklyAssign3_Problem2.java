package day1;

import java.util.Scanner;

public class WeeklyAssign3_Problem2 {
	public static void main(String[] args) {
			char ch1 = 'A';
			System.out.println("Entered character is "+ch1);
			
			int asciivalue = ch1;
			System.out.println("ASCII value of entered character is "+asciivalue);
			
			System.out.println("Addition of 5 to ASCII value is "+(asciivalue+5));
			
			char ch2 = (char)(asciivalue+5);
			System.out.println("Character obtained after adding 5 to ASCII value of "+ch1+" is "+ch2);
	}
}
