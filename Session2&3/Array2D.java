import java.util.Arrays;
public class Array2D {

    public static void main(String[] args) {

        // Create an array of integers
        int arr[][] = {{5,1,2},{4,3,7},{5,8,9}};
        for(int i=0; i<3 ;i++) {
        	for(int j=0; j<3; j++) 
        		System.out.print(arr[i][j]);
        	System.out.println();
        }
    }
}

