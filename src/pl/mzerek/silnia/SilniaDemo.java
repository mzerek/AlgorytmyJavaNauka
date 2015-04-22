package pl.mzerek.silnia;

public class SilniaDemo {

	public static void main(String[] args) {

		int k = 10;
		System.out.println("Rek Silnia  n= " + k + " wynosi " + silniaRek(k));
		
		System.out.println("Iter Silnia  n= " + k + " wynosi " + silniaIter(k));

	}

	public static int silniaRek(int nElement) {
		if (nElement > 1)
			return nElement * silniaRek(--nElement);
		else
			return 1;
	}

	public static int silniaIter(int nElement) {
		int wynik = 1;
		int i = 1;
		int n = nElement;

		if (n == 0) {
			wynik = 1;
		} else {
			while (i < n) {
				i++;
				wynik *= i;
			}
		}
		return wynik;
	}

}
