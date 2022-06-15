package binarySearch;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int arraySize; // a variable for setting the array size
		Scanner in = new Scanner(System.in); // initialize a scanner for array inputs;
		System.out.println("How large is the array?");
		arraySize = in.nextInt();
		System.out.print("\n");
		int[] arr = new int[arraySize]; // initialize int array for sorting and searching
		System.out.println("Enter 10 integers 1 at a time ");
		for(int i = 0; i < 10;i++)
		{
			arr[i] = in.nextInt();
			System.out.print("\n");
		}
		
		
		arraySort(arr);
		System.out.println("test: ");
		for(int i = 0; i<arr.length;i++)
			System.out.println("index " + i + ": " + arr[i]);
		
		System.out.println("enter the number you are looking for: ");
		int key = in.nextInt();
		System.out.print("\n");
		
		System.out.println("The number you are looking for is in index ");
		System.out.println(binarySearch(arr,key));
		
		in.close();

	}
	
	public static int binarySearch(int[] list, int key){
		int low = 0;
		int high = list.length - 1;
		
		while (high >= low) {
			int mid = (low + high) /2;
			if(key<list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid+1;
		}
		return -low - 1; //key not found
	}

	public static void arraySort(int[] list)
	{
		for(int i = 0; i < list.length - 1; i++) 
		{
			int currentMinimum = list[i];
			int currentMinIndex = i;
			
			for(int j = i+1; j<list.length; j++) {
				if(currentMinimum > list[j]) {
					currentMinimum = list[j];
					currentMinIndex = j;
				}
			}
			
			if(currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMinimum;
			}
		}
	}
}
