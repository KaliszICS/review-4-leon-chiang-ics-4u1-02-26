import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();		
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String x = s.nextLine();
		x=(5+x);
		int y = Integer.parseInt(x);
		System.out.println(y+5);
		
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String x = s.nextLine();
		x=(4+x+3);
		Double y = Double.parseDouble(x);
		System.out.println(y+3.4);
		
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a boolean: ");
		String x = s.nextLine();
		Boolean y = Boolean.parseBoolean(x);
		System.out.println(y!=true);
		
	}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String x = s.nextLine();
		x=(x+3);
		int y = Integer.parseInt(x);
		y=(y+2);
		char z=(char)y;
		System.out.println(z);
		
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input an integer: ");
		String x = s.nextLine();
		x=(x+1);
		int y = Integer.parseInt(x);
		y=(y/2);
		double z=(double)y;
		System.out.println(z);
		
	}

	public static void q6() {
		Scanner s = new Scanner(System.in);
		System.out.print("Input a number: ");
		String x = s.nextLine();
		x=(1+x);
		double y = Double.parseDouble(x);
		int z= (int)y;
		System.out.println(z);
		
	}

}
