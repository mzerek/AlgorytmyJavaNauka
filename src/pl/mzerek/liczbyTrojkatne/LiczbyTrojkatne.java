package pl.mzerek.liczbyTrojkatne;

import java.util.Arrays;

public class LiczbyTrojkatne {

	public static void main(String[] args) {

		int numEl = 15;
		int[] ciagTrojkatny = new int[numEl];
		ciagTrojkatny[0] = 1;
		for (int n = 1; n < numEl; n++) {
			ciagTrojkatny[n] = (n + 1) + ciagTrojkatny[n - 1];
		}

		System.out.println(Arrays.toString(ciagTrojkatny));

		System.out.println("===");
		int k = 10;
		System.out.println("Elemtn n= " + k + " wynosi "
				+ fintElementCiaguTrojkatnego(k));

		System.out.println("===");
		
		System.out.println("Elemtn n= " + k + " wynosi "
				+ fintElementCiaguTrojkatnegoRek(k));
	}

	public static int fintElementCiaguTrojkatnego(int nElement) {
		int i = 1;
		int sum = 0;
		while (i <= nElement) {
			sum = sum + i;
			i++;
		}

		return sum;
	}

	public static int fintElementCiaguTrojkatnegoRek(int nElement) {
		if (nElement > 0)
			return nElement + fintElementCiaguTrojkatnegoRek(--nElement);
		else
			return 0;
	}

}
