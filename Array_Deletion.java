package CONCEPTS_Day2;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Deletion {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[20];
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<size;i++)
		{
			System.out.print(arr[i]+"   ");
			
		}
		System.out.println( "Enter the position to Delete:");
		int delpos=sc.nextInt();
		System.out.println(arr[3]);
		for(int mypos=delpos-1;mypos<size;mypos++)
		{
			arr[mypos]=arr[mypos+1];
		}
		size--;
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	

}
