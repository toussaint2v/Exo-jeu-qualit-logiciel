package monopoly;

public class Joueur {
	
	private String nom;
	private int compte=1500;
	private Pion pion;
	private Case pCase;
	private boolean enPrison=false;
	
	public Joueur(String nom, Pion pion) {
		this.nom=nom;
		this.pion=pion;
	}
	
	
	public void deplacer(Case c) {
		System.out.println(this+" de la case "+pCase+" a la "+c);
		pCase.removJoueur(this);
		pCase=c;
		pCase.setJoueur(this);		
	}
	
	public void allerPrison() {
		System.out.println(this+" en prison!");
		enPrison=true;
	}
	
	public void sortirPrison() {
		enPrison=false;
	}
	
	public boolean enPrison() {
		return enPrison;
	}
	
	public int getCase() {
		return pCase.getCaseId();
	}
	
	public void setCase(Case c) {
		pCase=c;
		pCase.setJoueur(this);
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
