package javaprograms;

import java.util.Iterator;

public class ReplaceEvryElemntPreviousElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3};
		int temp[]=new int[4];
		
		for (int i = 0; i < a.length; i++) {
			
			temp[i]=a[i]+a[a.length/2];
			
			System.out.println(temp[i]);
		}
		
		
		
		
	}

}
