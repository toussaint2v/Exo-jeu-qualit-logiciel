package monopoly;

import java.util.ArrayList;

public class Partie {
	
	private ArrayList<Joueur> joueurs;
	private De de1;
	private De de2;
	//private Plateau plateau;
	private int tours;
	private ArrayList<Case> plateau;
	int nbCases=40;
	
	public Partie(ArrayList<Joueur> joueurs,int tours){
		this.joueurs=joueurs;
		de1=new De();
		de2=new De();
		plateau=new ArrayList<Case>();
		this.tours=tours;
		genererCases(nbCases);
	}
	
	public void LancerPartie() {
		for(Joueur j:joueurs) { //init des joueurs
			j.setCase(plateau.get(0));
		}
		for(int k=0;k<=tours;k++) {
			for(Joueur j:joueurs) {
				int d1=de1.lancer();
				int d2=de2.lancer();
				int ind=j.getCase(); //indice case actuelle
				Case nextCase=plateau.get((ind+d1+d2)%nbCases);
				if(!j.enPrison()) {
					j.deplacer(nextCase);					
					nextCase.action();
				}
			}
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
				
			}
			else {
			Case ci=new CaseAutre();
			plateau.add(ci);
			}
		}
	}
	

}
