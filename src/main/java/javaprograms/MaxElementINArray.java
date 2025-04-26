package javaprograms;

public class MaxElementINArray {
	
	public static void main(String []args) {
		int arr[]= {20,30,80,10,5};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				
			}
			
			
		}
		System.out.print(max);
		
		
		
		
		
	}

}
