package javadsa;
import java.util.Scanner;

public class minmax {
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

System.out.print("Enter array size: ");
int size = sc.nextInt();
int[] num = new int[size];
 System.out.println("Enter " + size + " elements:");
for (int i = 0; i < size; i++) {
	num[i] = sc.nextInt();
     }
int min = num[0];
int max = num[0];

 for (int i = 1; i < size; i++) {
       if (num[i] < min) {
       min = num[i]; 
       }
      if (num[i] > max) {
          max = num[i]; 
     }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        
        sc.close();
    }
}
