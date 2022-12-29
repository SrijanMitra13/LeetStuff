import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args) {
        Solution soln = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(soln.containsDuplicate(nums));
    }

    public static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);

            for(int i = 0; i<nums.length-1; i++){
                if(nums[i] == nums[i+1]){
                    return true;
                }
            }
            return false;
        }
    }
}
