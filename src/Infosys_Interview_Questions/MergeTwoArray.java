package Infosys_Interview_Questions;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 4, 5 };
		int arr1[] = { 4, 5, 6, 7, };
		int merge[] = new int[arr.length + arr1.length];
		int index = 0;
		for (int b : arr) {
			merge[index++] = b;
		}
		for (int b : arr1) {
			merge[index++] = b;
		}
		System.out.println(Arrays.toString(merge));
	}
}
