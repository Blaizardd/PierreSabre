package histoire;

import personnages.Humain;
import personnages.Commercant;


public class HistoireTP4 {
	
	public static void main(String args[]) {
		/*Humain Prof = new Humain("Prof", "kombucha", 54);
		Prof.direBonjour();
		Prof.acheter("une boisson", 12);
		Prof.boire("kombucha");
		Prof.acheter("un jeu", 2);
		Prof.acheter("un kimono", 50);*/
		
		Commercant Marco = new Commercant("Marco",20);
		Marco.direBonjour();
		Marco.direMondeInjuste();
		Marco.boire("the");
		
		
	}
	
	
}
