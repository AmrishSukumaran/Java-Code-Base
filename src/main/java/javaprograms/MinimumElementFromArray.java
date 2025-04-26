package javaprograms;

import java.util.Arrays;
import java.util.List;

public class MinimumElementFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {20,30,80,10,5};
		
int min=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				
			}
			
			
		}
		System.out.print(min);
		
		
		
		
		
		

	}

}
