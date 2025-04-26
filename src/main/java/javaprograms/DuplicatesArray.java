package javaprograms;

import java.util.*;

public class DuplicatesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nums[]= {1,2,2,3,3,4,5,5};
		Set<Integer> hSet=new LinkedHashSet<Integer>();
		Set<Integer> duplicatesInHashSet=new LinkedHashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			
			boolean status=hSet.add(nums[i]);
			
			if(!status) {
				duplicatesInHashSet.add(nums[i]);
				
			}
		}
		System.out.println(duplicatesInHashSet);
		
		
	}
}
		
		