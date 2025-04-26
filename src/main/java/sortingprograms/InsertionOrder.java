package sortingprograms;

import java.util.Arrays;

public class InsertionOrder {
	
	public static void insertionOrder(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			int current=arr[i];
			int j=i-1;
			
			
			
			while(j>=0 && arr[j]>current) {
				arr[j+1]=arr[j];
				j--;
				
				
			}
			arr[j-1]=current;
			
			
			
			
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	public static void main(String[] args) {
		
		int arr[]= {90,20};
		
		
		
		insertionOrder(arr);
				

	}

}
