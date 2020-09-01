package oppgover;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgove5_karakterskala {

	public static void main(String[] args) {
		final int ELEVER = 10;
		for (int i=0; i<ELEVER; i++) {
				karakter(i+1);
		}
	}
		private static void karakter(int a) {
			String bokstav="";
			int poeng=parseInt(showInputDialog("Poengsum til elev nommer " + a));
		if(poeng<=100 && poeng>=0) {
			if (poeng<=39){
				bokstav="F";
			} else if (poeng<=49) {
				bokstav="E";
			} else if (poeng<=59){
				bokstav="D";
			} else if (poeng<=79) {
				bokstav="C";
			}else if (poeng<=89) {
				bokstav="B";
			} else if (poeng<=100) {
				bokstav="A";
			}
			System.out.println( "Elev " + a + " får karakteren: " + bokstav);
		} else {
			showMessageDialog(null, "Du må skriva inn ein gokjent poengsum");
			karakter(a);
		}
	}

}
