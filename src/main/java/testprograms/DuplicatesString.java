package testprograms;
import java.util.*;

public class DuplicatesString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="Amrishaaaaa";
		HashMap<Character,Integer> duplicates=new HashMap<Character,Integer>();
		int count =0;
		for(int i=0;i<name.length();i++) {
			if(duplicates.containsKey(name.charAt(i))) {
				duplicates.put(name.charAt(i), ++count);
				
				
			}else {
				duplicates.put(name.charAt(i), 1);
			}
		}
		
		System.out.println(duplicates);
		
		
		
		

	}

}
