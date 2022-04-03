package structure;

import cases.*;
import cases.Propriete.CasePropriete;
import cases.Propriete.CaseProprieteCompagnie;
import cases.Propriete.CaseProprieteGare;
import cases.Propriete.CaseProprieteImmobilier;
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
		int j = 0;
		for(int i=1;i<=nbCases;i++) {
			Case cas;
			if(i==10) {
				cas = new CasePrison();
			}
			else if(i==30) {
				cas = new CaseAllerPrison();

			}else if(i==12) {
				cas = new CaseImpot();

			}else if(i==16) {
				cas = new CaseChance();

			}
			else {
				if (j <= 2){
					cas=new CaseProprieteImmobilier();
				}
				else if (j <= 3){
					cas=new CaseProprieteGare();
				}else {
					cas=new CaseProprieteCompagnie();
					j = 0;
				}
				++j;

			}
			plateau.add(cas);
		}
	}


	/*
	public void genererCases(int nbCases) {
		cases.Case c=new cases.CaseDepart();
		for(int i=0;i<=nbCases;i++) {
			cases.Case c=new cases.Case();
			plateau.add(c);
		}
	}
	/*
	public void deplacer(joueur.joueur.Joueur j, int nb) {
		monopoly.structure.Pion p=j.getPion();
		cases.Case c=p.getCase();
		int ind=c.getCaseId();
		c.removPion(p);
		cases.Case caseSuiv=plateau.get((ind+nb)%nbCases);
		caseSuiv.setPion(p);
		System.out.println(j+" de la case "+ind+" a la "+caseSuiv);
	}*/
	

}
