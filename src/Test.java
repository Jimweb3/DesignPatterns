import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = a +b;
//		System.out.println(c);	
		
		double a;
		int b;
		
		Scanner scanner = new Scanner(System.in);
		
		a = scanner.nextDouble();
		b = scanner.nextInt();

		System.out.println(Math.pow(a, b));
		
	}
}
