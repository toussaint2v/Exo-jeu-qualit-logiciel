package structure;

import cases.Case;
import design.Color;
import joueur.Joueur;


import java.util.ArrayList;

public class Partie {
	
	private ArrayList<Joueur> joueurs;
	private De de1;
	private De de2;
	//private monopoly.Plateau plateau;
	private int tours;
	private Plateau plateau;
	int nbCases=40;
	
	public Partie(ArrayList<Joueur> joueurs, int tours){
		this.joueurs=joueurs;
		de1=new De();
		de2=new De();
		plateau=new Plateau();
		this.tours=tours;
		Color color = new Color();
	}
	
	public void LancerPartie() {
		for(Joueur j:joueurs) { //init des joueurs
			plateau.initJoueur(j);
		}
		for(int k=0;k<=tours;k++) {
			for(Joueur j:joueurs) {
				int d1=de1.lancer();
				int d2=de2.lancer();
				int ind=j.getCase(); //indice case actuelle
				Case nextCase= Plateau.getCase((ind+d1+d2)%nbCases);
				j.deplacer(nextCase);
				nextCase.action(j);

			}
		}
	}



}
