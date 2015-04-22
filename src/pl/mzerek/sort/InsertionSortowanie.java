package pl.mzerek.sort;

import java.util.Arrays;

public class InsertionSortowanie {
	
	static int[] unsortTab = { 0, 7, 5, 2, 8, 6, 3, 4, 1, 9 };

	public static void main(String[] args) {
		int n = unsortTab.length;
		
		System.out
		.println("Przed posortowanien: " + Arrays.toString(unsortTab));
	
		for(int i = 1; i<n;i++){
			int tmp = unsortTab[i];
			int k = i;
			while(k>0 && unsortTab[k-1] >= tmp){
//				/System.out.println("W trakcie k: "+ k +" :::: " + " i: "+ i +" :::: "+ Arrays.toString(unsortTab));
				unsortTab[k] = unsortTab[k-1];
				k--;
			}
			
			unsortTab[k]=tmp;
		}
		
		System.out.println("Po posortowaniu: " + Arrays.toString(unsortTab));


	}

}
