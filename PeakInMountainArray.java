

public class PeakInMountainArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 3, 5, 7, 8, 6, 4, 2};
		System.out.println(peakIndexInMountainArray(arr));

	}
	
	static int peakIndexInMountainArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		
		while(start < end) {
			int mid = start + (end - start)/2;
			
			if(arr[mid] > arr[mid+1]) {
				end = mid;
			}else {
				start = mid + 1;
			}
		}
		return arr[start];
	}

}
