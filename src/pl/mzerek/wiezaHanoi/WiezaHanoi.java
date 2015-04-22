package pl.mzerek.wiezaHanoi;

public class WiezaHanoi {
	
	static int nDisk = 3;

	public static void main(String[] args) {
		wieza(3, 'A', 'B', 'C');
		
	}
	
	public static void wieza(int dyski, char kolLew, char kolSr, char kolPraw){
		
		if(dyski == 1){
			System.out.println("Dysk 1 z " + kolLew +  " na " + kolPraw);
		}
		else{
			wieza(dyski-1, kolLew, kolPraw, kolSr);
			System.out.println("Dysk " + dyski + " z " + kolLew +  " na " + kolPraw);
			wieza(dyski-1, kolSr, kolLew, kolPraw);
		}
		
	}
	

}
