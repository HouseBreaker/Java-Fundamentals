package p15_RecursiveBinarySearch;

public class RecursiveBinarySearch {
	public static void main(String[] args) {
		int numberToSearch = 8;
		int[] numbers = {4, 4, 4, 4, 4, 8, 8, 8};

		System.out.println(BinarySearch(numbers, numberToSearch));
	}

	private static int BinarySearch(int[] arr, int target) {
		return BinarySearch(arr, 0, arr.length - 1, target);
	}

	private static int BinarySearch(int[] a, int start, int end, int target) {
		int middle = (start + end) / 2;
		if (end < start) {
			return -1;
		}

		if (target == a[middle]) {
			return middle;
		} else if (target < a[middle]) {
			return BinarySearch(a, start, middle - 1, target);
		} else {
			return BinarySearch(a, middle + 1, end, target);
		}
	}


}
