import joueur.Joueur;
import structure.Partie;
import structure.Pion;

import java.util.ArrayList;

public class TestMonopoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Joueur> joueurs=new ArrayList<Joueur>();
		Pion p1=new Pion("red");
		Joueur j1=new Joueur("alain",p1);
		Pion p2=new Pion("blue");
		Joueur j2=new Joueur("bob",p2);
		joueurs.add(j1);
		joueurs.add(j2);
		
		Partie partie=new Partie(joueurs,30);
		
		partie.LancerPartie();
		

	}

}
