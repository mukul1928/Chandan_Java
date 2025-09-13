package Practice_Java_Interview_Questions;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 5 };
		int arr2[] = { 5, 6, 7, 2 };
		int a[] = new int[arr1.length + arr2.length];
		int index = 0;
		for (int b : arr1) {
			a[index++] = b;
		}
		for (int b : arr2) {
			a[index++] = b;
		}
		System.out.println(Arrays.toString(a));
	}
}
