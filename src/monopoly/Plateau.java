package monopoly;

import java.util.ArrayList;

public class Plateau {
	
	private ArrayList<Case> plateau;
	int nbCases=30;
	
	public Plateau() {
		plateau=new ArrayList<Case>();
		genererCases(nbCases);
	}
	
	public void initPion(Pion p) {
		Case start=plateau.get(0);
		start.setPion(p);
	}
	
	public void getCases() {
		for(int i=0;i<=30;i++) {
			System.out.println(plateau.get(i));
		}
	}
	
	public void genererCases(int nbCases) {
		for(int i=0;i<=nbCases;i++) {
			Case c=new Case();
			plateau.add(c);
		}
	}
	
	public void deplacer(Joueur j, int nb) {
		Pion p=j.getPion();
		Case c=p.getCase();
		int ind=c.getCaseId();
		c.removPion(p);
		Case caseSuiv=plateau.get((ind+nb)%nbCases);
		caseSuiv.setPion(p);
		System.out.println(j+" de la case "+ind+" a la "+caseSuiv);
	}
	

}
