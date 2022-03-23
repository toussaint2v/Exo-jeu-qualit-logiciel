package structure;

import cases.*;
import joueur.Joueur;


import java.util.ArrayList;

public class Plateau {
	
	private static ArrayList<Case> plateau = new ArrayList<>();
	int nbCases=40;
	
	public Plateau() {
		genererCases(nbCases);
	}
	public Plateau(int nbCases) {
		genererCases(nbCases);
	}
	
	public void initJoueur(Joueur j) {
		Case start=plateau.get(0);
		j.setCase(start);
	}
	public static Case getCase(int idCase){
		return plateau.get(idCase);
	}
	
	public void getCases() {
		for(int i=0;i<=30;i++) {
			System.out.println(plateau.get(i));
		}
	}
	public void genererCases(int nbCases) {
		Case c=new CaseDepart();
		plateau.add(c);
		for(int i=1;i<=nbCases;i++) {
			if(i==10) {
				Case cp=new CasePrison();
				plateau.add(cp);
			}
			else if(i==30) {
				Case ap=new CaseAllerPrison();
				plateau.add(ap);

			}else if(i==12) {
				Case ap=new CaseImpot();
				plateau.add(ap);

			}else if(i==16) {
				Case ap=new CaseChance();
				plateau.add(ap);

			}
			else {
				Case ci=new CaseAutre();
				plateau.add(ci);
			}
		}
	}


	/*
	public void genererCases(int nbCases) {
		Case c=new CaseDepart();
		for(int i=0;i<=nbCases;i++) {
			Case c=new Case();
			plateau.add(c);
		}
	}
	/*
	public void deplacer(joueur.Joueur j, int nb) {
		monopoly.Pion p=j.getPion();
		Case c=p.getCase();
		int ind=c.getCaseId();
		c.removPion(p);
		Case caseSuiv=plateau.get((ind+nb)%nbCases);
		caseSuiv.setPion(p);
		System.out.println(j+" de la case "+ind+" a la "+caseSuiv);
	}*/
	

}
