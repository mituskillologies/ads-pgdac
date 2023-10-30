import java.util.Arrays;
public class ArrayOperations {

    public static void main(String[] args) {

        // Create an array of integers
        int[] arr = new int[]{5, 1, 2, 4, 3};

        // Traverse the array
        System.out.println("Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Sort the array in ascending order
        Arrays.sort(arr);

        // Print the sorted array
        System.out.println("Sorted array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();

        // Find the maximum element in the array
        int max = arr[arr.length - 1];

        // Print the maximum element
        System.out.println("Maximum element: " + max);

        // Find the minimum element in the array
        int min = arr[0];

        // Print the minimum element
        System.out.println("Minimum element: " + min);

        // Reverse the array
        for(int i = arr.length-1; i>=0; i--)
        	System.out.print(arr[i]+ " ");

        System.out.println();

    }
}

