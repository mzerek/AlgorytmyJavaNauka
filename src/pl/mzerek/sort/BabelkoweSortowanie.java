package pl.mzerek.sort;

import java.util.Arrays;

//O(N^2)

public class BabelkoweSortowanie {

	static int[] unsortTab = { 0, 7, 5, 2, 8, 6, 3, 4, 1, 9 };

	public static void main(String[] args) {

		int n = unsortTab.length;

		System.out.println(Arrays.toString(unsortTab));

		for (int i = 1; i < n; i++) {
			for (int k = n - 1; k >= 1; k--) {
				if (unsortTab[k] < unsortTab[k - 1]) {
					swap(k, k-1);
				}
			}
		}
		System.out.println(Arrays.toString(unsortTab));
	}

	private static void swap(int one, int two) {
		int tmp = unsortTab[one];
		unsortTab[one] = unsortTab[two];
		unsortTab[two] = tmp;
	}

}
