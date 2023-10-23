package personnages;

public class Commercant extends Humain {
	
	
	public Commercant(String Nom, int NbArgent) {
		super(Nom,"the",NbArgent);
	}
	
	
	public void direMondeInjuste(){
		parler("J'ai tout perdu. Le monde est vraiment trop injuste");
	}
	
	public void remercier(int montant) {
		parler(montant + " sous ! " + "Je te remercie généreux donateur");
	}
	
	public void seFaireExtorquer() {
		perdreArgent(this.NbArgent);
		direMondeInjuste();
	}
	
	public void recevoir(int argent) {
		gagnerArgent(argent);
		remercier(argent);
	}
}
