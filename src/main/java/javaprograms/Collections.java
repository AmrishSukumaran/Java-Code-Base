package javaprograms;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Input list =[4, 7, 3, 2, 9, 6, 1]

		// Output list= [4, 7, 3, 2, 9, 6, 1, 11, 7,6,13,10,5]

		int a[] = { 4, 7, 3, 2, 9, 6, 1 };

		ArrayList<Integer> aList = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			aList.add(a[i]);

		}
		
		for (int i = 1; i <a.length; i++) {
			aList.add(aList.get(0)+aList.get(i));

		}
		
		System.out.println(aList);
	}
}