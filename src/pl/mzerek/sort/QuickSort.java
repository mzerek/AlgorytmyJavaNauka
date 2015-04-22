package pl.mzerek.sort;

import java.util.Arrays;

public class QuickSort {

	static int[] unsortTab = { 0, 7, 5, 2, 8, 6, 3, 4, 1, 9 };
	
	static int[] unsortTab2 = { 0, 7, 5, 2, 8, 6, 3, 4, 1, 9 };

	public static void main(String[] args) {
		int n = unsortTab.length;

		System.out
				.println("Przed posortowanien: " + Arrays.toString(unsortTab));
		quickSortV1(0, n - 1);

		System.out.println("Po posortowaniu: " + Arrays.toString(unsortTab));
		
		System.out.println("==================== ");
		System.out.println("==================== ");

		System.out
				.println("Przed posortowanien: " + Arrays.toString(unsortTab2));
		quickSortV2(0, n - 1);

		System.out.println("Po posortowaniu: " + Arrays.toString(unsortTab2));
	}

	public static void quickSortV2(int lewy, int prawy) {
		int pivot = unsortTab2[(lewy + prawy) / 2];
		int i, j;
		i = lewy;
		j = prawy;

		do {
			while (unsortTab2[i] < pivot)
				i++;
			while (unsortTab2[j] > pivot)
				j--;

			if (i <= j) {
				swap2(i, j);
				i++;
				j++;
			}

		} while (i <= j);
		
		if(j>lewy) quickSortV2(lewy,j);
		if(i<prawy) quickSortV2(i,prawy);

	}

	public static void quickSortV1(int lewo, int prawo) {
		if (prawo - lewo <= 0) {
			return;
		} else {
			int pivot = unsortTab[prawo];
			int partycja = partycjonowanie(lewo, prawo, pivot);

			quickSortV1(lewo, partycja - 1);
			quickSortV1(partycja + 1, prawo);
		}
	}

	public static int partycjonowanie(int lewo, int prawo, int pivot) { // pivot
																		// = oœ
		int lewaPart = lewo - 1;
		int prawaPart = prawo;

		while (true) {
			while (unsortTab[++lewaPart] < pivot) {
				;
			}
			while (prawaPart > 0 && unsortTab[--prawaPart] > pivot) {
				;
			}

			if (lewaPart >= prawaPart) {
				break;
			} else {
				swap(lewaPart, prawaPart);
			}

		}
		swap(lewaPart, prawo);
		return lewaPart;
	}

	private static void swap(int one, int two) {
		int tmp = unsortTab[one];
		unsortTab[one] = unsortTab[two];
		unsortTab[two] = tmp;
	}
	
	private static void swap2(int one, int two) {
		int tmp = unsortTab2[one];
		unsortTab2[one] = unsortTab2[two];
		unsortTab2[two] = tmp;
	}

}
