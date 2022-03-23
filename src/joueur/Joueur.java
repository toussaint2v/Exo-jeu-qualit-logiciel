package joueur;

import cases.Case;
import design.Color;
import structure.Pion;
import structure.Plateau;

public class Joueur {
	
	private final String nom;
	private int compte=1500;
	private final Pion pion;
	private Case pCase;
	private int annePrison=0;

	public Joueur(String nom, Pion pion) {
		this.nom=nom;
		this.pion=pion;
	}
	
	
	public void deplacer(Case c) {
		if (getAnnePrison() > 0){
			System.out.println( this+ Color.colors.get("red") +" est en prison" + Color.colors.get("reset"));
			annePrison -= 1;
		}else{
			System.out.println(this+" de la "+pCase+" a la "+c);
			pCase.removJoueur(this);
			setCase(c);
		}

	}
	
	public void allerPrison() {
		System.out.println( this+ Color.colors.get("yellow") + " va en prison!" + Color.colors.get("reset"));
		annePrison=1;
		setCase(Plateau.getCase(10));



	}
	
	public void sortirPrison() {
		annePrison=0;
	}
	
	public int getAnnePrison() {
		return annePrison;
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
		return "joueur " + Color.colors.get(pion.getCouleur()) +nom + Color.colors.get("reset") +" avec "+compte;
	}

}
