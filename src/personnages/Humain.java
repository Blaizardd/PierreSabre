package personnages;

public class Humain {
	private String nom;
	private String BoissonFav;
	protected int NbArgent;
	
	public Humain(String nom, String BoissonFav, int NbArgent) {
		this.nom = nom;
		this.BoissonFav = BoissonFav;
		this.NbArgent = NbArgent;
		
	}

	public String getNom() {
		return nom;
	}


	public int getNbArgent() {
		return NbArgent;
	}
	
	public void parler(String texte) {
		System.out.println(texte);
	}
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle " + getNom() + " et j'aime boire du " + this.BoissonFav);
	
	}
	
	public void boire(String boisson) {
		parler("Mmmm, un bon verre de " + boisson + "! GLOUPS !");
		
	}
	public void gagnerArgent(int gain) {
		this.NbArgent = this.NbArgent + gain;
	}
	
	public void perdreArgent(int perte) {
		this.NbArgent = this.NbArgent - perte;
	}
	
	public void acheter(String bien, int prix) {
		if (getNbArgent() < prix) {
			parler("Je n'au plus que " + getNbArgent() + " sous en poche. Je ne peux pas m'offrir " + bien + " à " + prix + " sous");
		}else {
			parler("J'ai " + getNbArgent() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		}
	}
}
