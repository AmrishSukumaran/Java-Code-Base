package setprograms;
import java.util.*;
public class duplicates {
	
	
	
	public static void main(String[] args) {
		
		int a[]= {1,2,3,3,2,4,5};
		int newArr[]=new int[3];
		Set<Integer> hashSet=new LinkedHashSet<Integer>();
		Set<Integer> duplicates=new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
			boolean status=hashSet.add(a[i]);
			
			if(!status) {
				
				duplicates.add(a[i]);
				
				
				
			}
			
			
			
			
			
			
		}
		Object[] array = duplicates.toArray();
		
		System.out.println(Arrays.toString(duplicates.toArray()));
		
		
		
		
		
		
		
		
		
	}

}
