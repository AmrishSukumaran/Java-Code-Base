package testprograms;

public class MaxElementMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{1,2,3},{3,4},{9,7}};
		
		
		int max=arr[0][0];
		
		for(int j=0;j<arr.length;j++) {
			for(int i=0;i<arr[j].length;i++) {
				if(arr[j][i]>max) {
					max=arr[j][i];
					
				}
				
				
				
			}
			System.out.println(max);
			
			
		}
		
		
		
		
		
		

	}

}
