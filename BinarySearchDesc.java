

public class BinarySearchDesc {

	public static void main(String[] args) {
		
		int[] arr = {90, 75, 18, 12, 6, 4, 3, 1, -5, -10, -15, -20};
		int target = -20;
		System.out.println(binarySearchDesc(arr, target));

	}

	static int binarySearchDesc(int[] arr, int target) {
		int start = 0;
		int end = arr.length -1;
		
		while(start <= end) {
			int mid = start + (end - start)/2;
			
			if(target > arr[mid]) {
				end = mid -1;
			}else if(target < arr[mid]) {
				start = mid + 1;
			}else {
				return mid;
			}
		}
		return -1;
	}

}
