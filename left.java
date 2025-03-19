package javadsa;
import java.util.Scanner;
import java.util.Arrays;

public class left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];


        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int first = arr[0]; 
        for (int i = 0; i < size - 1; i++) {
            arr[i] = arr[i + 1]; 
        }
        arr[size - 1] = first;

        System.out.println("Rotated Array: " + Arrays.toString(arr));

        sc.close();
    }
}
