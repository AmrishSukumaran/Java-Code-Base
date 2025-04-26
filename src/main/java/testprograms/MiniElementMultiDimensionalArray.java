package testprograms;

public class MiniElementMultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][]= {{-5,4,3},{1,3,2},{-10,9,8}};
		
		int min=arr[0][0];
		
		
		for(int j=0;j<arr.length;j++) {
			
			for(int i=0;i<arr[j].length;i++) {
				if(arr[j][i]<min) {
					min=arr[j][i];
				}
			}
		}
		
		
		System.out.println(min);
		

	}

}
