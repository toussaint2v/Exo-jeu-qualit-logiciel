package monopoly;

public class Joueur {
	
	private String nom;
	private int compte=0;
	private Pion pion;
	
	public Joueur(String nom, Pion pion) {
		this.nom=nom;
		this.pion=pion;
	}
	
	
	public Pion getPion() {
		return pion;
	}
	
	public String getNom() {
		return nom;
	}
	
	public int getCompte(){
		return compte;
	}
	
	public void setCompte(int x){
		compte=x;
	}
	
	public void addToCompte(int x) {
		compte+=x;
	}
	
	public void takeFromCompte(int x) {
		compte-=x;
	}
	
	public String toString() {
		return "joueur "+nom;//+" avec "+compte+"€";
	}

}
