

import java.util.ArrayList;

public class RemoveDuplicates4mArray {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {10, 20, 30, 30, 30, 30, 40, 50, 60, 70, 70, 80, 90, 100, 100};
        removeDuplicate(arr);

    }
    
    static void removeDuplicate(int[] nums) {
        ArrayList<Integer> rd = new ArrayList<Integer>();
        
        for(int i = 0; i<nums.length-1; i++) {
            if(nums[i] != nums[i+1]) {
                rd.add(nums[i]);
            }
        }
        rd.add(nums[nums.length-1]);
        
        Object[] objects = rd.toArray();       
        for(Object obj : objects) {
            System.out.print(obj + " ");
        }
        
    }

}
