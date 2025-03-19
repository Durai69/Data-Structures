package javadsa;
import java.util.Scanner;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();

        int[] num = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            num[i] = sc.nextInt();
        }
        
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int temp = num[left];
            num[left] = num[right];
            num[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(num));

        sc.close();
    }
}
