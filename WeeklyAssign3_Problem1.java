package day1;

public class WeeklyAssign3_Problem1 {
	public static void main(String[] args) {
		float fmarks = 87.6F;
		System.out.println("Float marks = "+fmarks);
		
		double dmarks = fmarks;
		System.out.println("Float marks to Double marks = "+dmarks);

		int imarks = (int)dmarks;
		System.out.println("Double marks to Int marks = "+imarks);
		
		char asciivalue = (char)imarks;
		System.out.println("ASCII value of Int marks "+imarks+" = "+asciivalue);

	}
}
