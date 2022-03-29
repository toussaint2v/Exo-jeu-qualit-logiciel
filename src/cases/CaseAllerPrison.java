package cases;

import joueur.Joueur;

public class CaseAllerPrison extends Case {


	public CaseAllerPrison() {
		super();
	}

	@Override
	public void action(Joueur j) {
		// TODO Auto-generated method stub
		j.allerPrison();
		removJoueur(j);


	}


}
