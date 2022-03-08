package monopoly;

import java.util.ArrayList;

public class Partie {
	
	private ArrayList<Joueur> joueurs;
	private De de1;
	private De de2;
	private Plateau plateau;
	private int tours;
	
	public Partie(ArrayList<Joueur> joueurs,int tours){
		this.joueurs=joueurs;
		de1=new De();
		de2=new De();
		plateau=new Plateau();
		this.tours=tours;
	}
	
	public void LancerPartie() {
		for(Joueur p:joueurs) {
			plateau.initPion(p.getPion());
		}
		for(int k=0;k<=tours;k++) {
			for(Joueur j:joueurs) {
				int d1=de1.lancer();
				int d2=de2.lancer();
				plateau.deplacer(j, d1+d2);			
			}
		}
	}

}
