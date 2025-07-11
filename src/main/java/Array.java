public class Array {
	int[]returnedArray;
	int[] moveArray(int[] arr, int n){
		int [] returningArray = new int[arr.length];
		int[] tmpArray = new int[arr.length*2];
		for (int i = 0; i < tmpArray.length; i++) {
			if (i < arr.length) {
				tmpArray[i] = arr[i];
			} else if (i >= arr.length) {
				tmpArray[i] = arr[i - arr.length];
			}
		}

		for (int i = 0; i < returningArray.length; i++) {
			returningArray[i] = tmpArray[i + n];
		}
		return returningArray;
	}

	void printArray(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
