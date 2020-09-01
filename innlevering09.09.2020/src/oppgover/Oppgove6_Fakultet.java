package oppgover;

import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class Oppgove6_Fakultet {

	public static void main(String[] args) {
		Boolean overNull=false;
		int tal=0;
		
		while (!overNull) {
			tal=parseInt(showInputDialog("Kva tal vil du fakultere?"));
			if (tal>0) {
				overNull=true;
			} else {
				showMessageDialog(null, "Du må skrive inn eit heilt tal over 0");
			}
		}
		String svarTekst=(tal + "! = ");
		long sum=1;
		
		for (int i =1; i<=tal; i++) {
			sum=sum*i;
			if (i==1) {
				svarTekst+=i;
			} else {
				svarTekst+=(" * " + i);
			}
		}
		System.out.println(svarTekst+" = "+sum);
	}

}

