package sortingprograms;

import java.util.Arrays;

public class BubbleSort {

	public static void bubbleSort(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			int temp;
			for(int j=1;j<arr.length;j++) {
				if(arr[j]>arr[j-1])
				{
					temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				
		
				
				
				
				
			}
			
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[]= {50,48,23,42,34,-80};
		bubbleSort(arr);
		
	System.out.println(Arrays.toString(arr));
		

	}
	

}
