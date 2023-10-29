import java.util.Scanner;
import java.lang.Math;
class Prime {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = in.nextInt();
		int i;
		for(i=2; i<=Math.sqrt(num); i++)
			if (num % i == 0) {
				System.out.println("Not Prime");
				System.exit(0);
			}
		System.out.println("Prime");
	}
}
