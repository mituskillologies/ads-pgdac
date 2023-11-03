// Addition of two positive integers using recursion
import java.util.Scanner;
class AddRecur {
   	static int add(int a,int b)	{
     	if(b < 0)
			return 0;
     	else
			return(a + add(1, b-1));
  	}
    public static void main(String[] args) {
        int num1, num2, result;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = in.nextInt();
        System.out.print("Enter second number: ");
        num2 = in.nextInt();
        result = add(num1, num2);	
        System.out.println(num1+" + "+num2+" = "+result);
    }
}
