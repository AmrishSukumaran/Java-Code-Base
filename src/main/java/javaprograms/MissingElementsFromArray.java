package javaprograms;
import java.util.*;

public class MissingElementsFromArray{

public static void main(String[] args) {
   
	int a[]= {1,2,5};
	
	int length=a[a.length-1]-a[0];
	
	int ele=a[0];
	
	
	
	 Arrays.asList(a);
	Arrays.sort(a);
	
	
	Set<Integer> hset=new LinkedHashSet<Integer>();
	
	for(int i=0;i<length+1;i++) {
		
		if( length<a.length) {
			if(ele==a[i]) {
				ele+=1;
			}
			//hset.add(a[i]);
				
			
		}else {
			hset.add(ele);
			ele+=1;
			
		}
		
		
	}
	
	System.out.println(hset);
	
	
	
	
	
	
	
	
	
	
	
	
}
}