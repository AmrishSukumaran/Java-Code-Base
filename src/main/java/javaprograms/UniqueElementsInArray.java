package javaprograms;
import java.util.*;

public class UniqueElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,4,5};
		
		HashSet<Integer> hset=new HashSet<Integer>();
		HashSet<Integer> duplicateHset=new HashSet<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			boolean status = hset.add(arr[i]);
			if(!status) {
				duplicateHset.add(arr[i]);
			}
			
		}
		
		System.out.println(hset);
		System.out.println(duplicateHset);
		
		
		
		
		

	}

}
