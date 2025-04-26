package testprograms;
import java.util.*;

public class LargestNumberArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int arr[]= {30,40,2,5,10,21,24};
		int max=arr[0];
		List<Integer> list=new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				list.add(max);
				
				
				
			}
			
		}
		Collections.sort(list);
		System.out.println("Max element is: "+max);
		System.out.println("Second Largest element in list is:"+list);
		
		
	}

}
