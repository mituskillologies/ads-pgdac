import java.util.Scanner;
class Leap {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter an year: ");
		int year = in.nextInt();
		if(year % 4 ==0)
			if (year % 100 == 0)
				if (year % 400 == 0)
					System.out.println("Leap"); // 2000
				else
					System.out.println("Not Leap"); // 1900
			else
				System.out.println("Leap"); // 2024
		else
			System.out.println("Not Leap"); // 2023
		
	}
}
