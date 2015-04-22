package pl.mzerek.sort;

import java.util.Arrays;


//O(N^2)

public class SelectionSortowanie {

	static int[] unsortTab = { 0, 7, 5, 2, 8, 6, 3, 4, 1, 9 };

	public static void main(String[] args) {
		int n = unsortTab.length;

		System.out
				.println("Przed posortowanien: " + Arrays.toString(unsortTab));

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int k = i + 1; k < n; k++) {
				if (unsortTab[k] < unsortTab[min]) {
					min = k;
				}
			}
			swap(i, min);
		}

		System.out.println("Po posortowaniu: " + Arrays.toString(unsortTab));

	}

	private static void swap(int one, int two) {
		int tmp = unsortTab[one];
		unsortTab[one] = unsortTab[two];
		unsortTab[two] = tmp;
	}

}
