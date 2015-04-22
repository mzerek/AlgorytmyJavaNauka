package pl.mzerek.mnozenieRek;

public class Potegowanie {

	public static void main(String[] args) {

		System.out.println(potega(2, 7, "S"));		

	}

	public static int potega(int liczba, int potega, String znacznik) {

		System.out.println("liczba= " + liczba + ", potega= " + potega + " Znacznik= " + znacznik);

		if (potega == 0) {
			return 1;
		} else if (potega % 2 != 0) {
			return liczba * potega(liczba, --potega, "A");
		} else {
			int x=potega(liczba, potega / 2,  "B");
			return x*x;
		}
	}


}
