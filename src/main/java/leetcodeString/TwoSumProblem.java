package leetcodeString;
import java.util.*;

public class TwoSumProblem {

	public static int[] twoSum(int num[], int target) {
		HashMap<Integer,Integer> hmap=new HashMap<Integer,Integer>();

		for (int i = 0; i < num.length; i++) {
			int extra=target-num[i];
			
			if(hmap.containsKey(extra)) {
				return new int[] {hmap.get(extra),i};
			}
			hmap.put(num[i], i);
			

		}
return null;
	}

	public static void main(String[] args) {

		int num[] = { 1, 2, 5, 9 };
		int target = 7;
		
		System.out.println(Arrays.toString(twoSum(num,target)));

	}

}
