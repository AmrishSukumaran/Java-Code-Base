package javaprograms;
import java.util.*;
public class twoSum {
	
	//return indices of two numbers addition
	public static  int[] twoSum(int[] num,int target ) {
		
		int newArr[]=new int[2];
		
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<num.length;i++) {
			if(hmap.containsKey(target-num[i])) {
				newArr[1]=i;
				newArr[0]=hmap.get(target-num[i]);
				return newArr;
			}
			hmap.put(num[i],i);
		}
		
		return newArr;
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]= {3,2,4};
		int[] twoSum = twoSum(arr,5);
		System.out.println(Arrays.toString(twoSum));

	}
	
	
	

}
