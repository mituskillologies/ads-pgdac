// Addition of two positive integers using recursion
import java.util.Scanner;
class SumDigits {
    static int sumdig(int n) {
    	int sum = 0,rem;
    	if(n!=0)
    	{
			rem = n % 10;
			sum = rem + sumdig(n/10);
    	}
    	return(sum);
  	}
    public static void main(String[] args) {
        int num, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        num = in.nextInt();
        result = sumdig(num);	
        System.out.println("Sum of Digits = " + result);
    }
}
