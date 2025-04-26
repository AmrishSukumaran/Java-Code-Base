package mapprograms;
import java.util.*;
public class NoOfOccurancesOfNumberInArray {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[]= {1,2,3,4,5,5,4,3};
		
		
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<data.length;i++) {
			if(hmap.containsKey(data[i])) {
				hmap.put(data[i], hmap.get(data[i])+1);
			}
			else {
				hmap.put(data[i], 1);
			}
		}
		System.out.println(hmap);

	}

}
