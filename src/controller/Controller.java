package controller;

import java.util.ArrayList;

import joueur.Joueur;
import structure.Partie;

public class Controller {
	
	public Controller() {
		
	}
	
	public void jouer(ArrayList<Joueur> joueurs) {
		Partie partie=new Partie(joueurs,30);
		partie.LancerPartie();
	}
}
