

import java.util.Arrays;

public class TwoSum {

	public static void main(String[] args) {
		int[] nums = {1, 2, 56, 78, 95, 67};
		int target = 80;
		
		System.out.println(Arrays.toString(twoSum(nums, target)));
		

	}
	
	static int[] twoSum(int[] nums, int target){
		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j <nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i, j};
				}
			}
		}
		
		throw new IllegalArgumentException("no match found");
	}

}
