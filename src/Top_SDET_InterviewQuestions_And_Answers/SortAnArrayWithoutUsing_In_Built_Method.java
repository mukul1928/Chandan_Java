package Top_SDET_InterviewQuestions_And_Answers;

public class SortAnArrayWithoutUsing_In_Built_Method {
	public static void main(String[] args) {
		int[] array = { 5, 2, 9, 1, 6 };
		selectionSort(array);
		System.out.println("Sorted Array: ");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}

	public static void selectionSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < n; j++) {
				if (array[j] < array[minIndex]) {
					minIndex = j;
				}
			}
			// Swap array[i] and array[minIndex]
			int temp = array[i];
			array[i] = array[minIndex];
			array[minIndex] = temp;

		}
	}
}
