package day5;

public class WeeklyAssign4_Problem1 {
	public static void main(String[] args) {
		int count = 10;
		int a=0,b=1;
		int i=1;
			System.out.print(a+", "+b+", ");
			count=count-2;
		for(;i<=count;i++) {
			int c=a+b;//0+1=1
			a=b;
			b=c;
				System.out.print(c+", ");
		}
	}
}
