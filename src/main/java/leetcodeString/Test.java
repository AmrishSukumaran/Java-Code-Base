package leetcodeString;

import java.util.*;

public class Test {

	public static int removeElement(int[] nums, int val) {

		int j = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				nums[j] = nums[i];
				j++;
			}

		}
		return j;

	}

	public static void main(String[] args) {

		int nums[] = { 0, 1, 2, 2, 3, 0, 4, 2 };
		int value = 2;

		System.out.println(removeElement(nums, value));
		int removeElement = removeElement(nums, value);

		for (int i = 0; i < removeElement; i++) {
			System.out.println(nums[i]);	
			
		}
		
		
	}

}
