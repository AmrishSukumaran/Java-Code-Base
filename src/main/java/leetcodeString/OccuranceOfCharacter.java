package leetcodeString;

import java.util.Iterator;
import java.util.*;

public class OccuranceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Amrishaaa";
		str=str.toLowerCase();
		System.out.println(str);
		char ch='a';
		HashMap <Character,Integer> hMap=new HashMap<Character,Integer>();
		int j=0;
		for (int i = 0; i < str.length(); i++) {
			if(ch==str.charAt(i)) {
				hMap.put('a',++j);
			}
			
			
		}
		System.out.println(hMap);
	}

}
