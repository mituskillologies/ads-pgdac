import java.util.Scanner;
class Pattern {
	public static void main(String args[]) {
		/*Scanner in = new Scanner(System.in);
		System.out.print("Enter an year: ");
		int year = in.nextInt(); */
		for(int i = 1; i<= 5; i++) {
			for(int j = 1; j<=i; j++)
				System.out.print(i);
			System.out.println();		
		}
	}
}
