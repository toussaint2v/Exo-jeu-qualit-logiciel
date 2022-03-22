package monopoly;

import java.util.ArrayList;

public abstract class Case {
	
	public static int ind=0;
	private int id;
	private ArrayList<Pion> pions;
	protected ArrayList<Joueur> joueurs;
	
	public Case(){
		id=ind;
		ind++;
		joueurs=new ArrayList<Joueur>();
		//pions=new ArrayList<Pion>();
	}
	
	public abstract void action();
	

	
	public void setJoueur(Joueur j) {
		joueurs.add(j);
	}
	
	public void setPion(Pion pion) {
		pions.add(pion);
		pion.setCase(this);
	}
	
		
	public ArrayList<Pion> getPions() {
		return pions;		
	}
	
	public void removPion(Pion p) {
		pions.remove(p);
	}
	
	public void removJoueur(Joueur j) {
		joueurs.remove(j);
	}
	
	public int getCaseId() {
		return id;
	}
	
	public String toString(){
		return "case "+id;
	}

}
