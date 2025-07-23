package Infosys_Interview_Questions;

import java.util.Arrays;

public class SortingInArray {
	public static void main(String[] args) {
		int arr[] = { 1, 5, 2, 7 };
		System.out.println(Arrays.toString(sorting(arr)));

	}

	public static int[] sorting(int[] arr)// 1,5,2,7===1,2 //bubble sorting
	{
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j < arr.length - i; j++) {
				if (arr[i] < arr[i - 1])// -v
				{
					int temp = arr[i];
					arr[j] = arr[i - 1];
					arr[i - 1] = temp;
				}
			}
		}
		return arr;
	}
}
