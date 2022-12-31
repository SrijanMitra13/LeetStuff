

import java.util.ArrayList;

public class MergeTwoArrays {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Merge2Arrays();

    }
    
    static void Merge2Arrays() {
        int arr1[] = {1,2,3};
        int arr2[] = {4,5,6};
        
        ArrayList<Integer> merge = new ArrayList<Integer>();
        
        for(int i =0; i <= arr1.length-1; i++) {
            merge.add(arr1[i]);
        }
        
        for(int i =0; i <= arr2.length-1; i++) {
            merge.add(arr2[i]);
        }
        
        
        Object[] objects = merge.toArray();
        
        for(Object obj: objects) {
            System.out.print(obj + " ");
        }
        
    }

}
