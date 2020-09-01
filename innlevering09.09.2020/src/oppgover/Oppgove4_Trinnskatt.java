package oppgover;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgove4_Trinnskatt {

	public static void main(String[] args) {
		int toppSkatt=180800;
		double trinnskatt=0;
		double skatt=0;
		Boolean gyldigSvar=false;
		
		while (!gyldigSvar) {
			int bruttoinntekt = parseInt(showInputDialog("Kva er din Bruttoinntket?"));  //maks 2 147 483 647kr
			
			//Sjekker kva trinkatt ein skal bruke
			if (bruttoinntekt>=toppSkatt) {
				if (bruttoinntekt<=254500) {
					trinnskatt=1.9;
				} else if (bruttoinntekt <=639750) {
					trinnskatt=4.2;
				} else if (bruttoinntekt <=999550) {
					trinnskatt=13.2;
				} else {
					trinnskatt=16.2;
				}
				
				//Rekner ut skatten
				skatt=bruttoinntekt*(trinnskatt/100);
				skatt=Math.floor(skatt*100+0.5)/100;
				
				//Skriver ut kor mykje ein skal skatte for.
				showMessageDialog(null, "Vist du tjener " + bruttoinntekt +" må du betale: "
						+ trinnskatt + "%" + " i skatt, og det blir " + skatt + "kr i skatt");
				gyldigSvar=true;
				
			} else if (bruttoinntekt>=0) {
				showMessageDialog(null, "Du slepper å betale trinnskatt");
				gyldigSvar=true;
			} else {
				showMessageDialog(null, "Talet må våre større en 0");
			}
		}	
	}
}
