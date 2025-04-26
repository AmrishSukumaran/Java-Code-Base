package mapprograms;
import java.util.*;
import java.util.Map.Entry;
public class MaximumDuplicateArrayInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="abbaba";
		HashMap<Character,Integer> hmap=new HashMap<Character,Integer>();
		
		
		for(int i=0;i<str.length();i++) {
			
			if(hmap.containsKey(str.charAt(i))) {
				hmap.put(str.charAt(i), hmap.get(str.charAt(i))+1);
			}
			else {
				hmap.put(str.charAt(i), 1);
			}
		}
			
		
		
	
		
		
		
		Set<Entry<Character, Integer>> entrySet = hmap.entrySet();
		
		
		String returnStr="";
		int maxCount=0;
		char maxChar=0;
		
		for(Entry<Character,Integer> entry:entrySet) {
			
			if(entry.getValue()>maxCount) {
				returnStr+=entry.getKey();
				
			}
			
			
		}
		
		System.out.println(returnStr);

	}

}
