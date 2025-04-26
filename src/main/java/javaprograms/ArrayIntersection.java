package javaprograms;
import java.util.*;
public class ArrayIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nums1[]= {4,9,5};
		int nums2[]= {9,4,9,8,4};
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		
		for(int i=0;i<nums1.length;i++) {
			for(int j=0;j<nums2.length;j++) {
				if(nums1[i]==nums2[j]) {
					
					set.add(nums2[j]);
					
					
				}
			}
		}
		System.out.println(set);

	}

}
