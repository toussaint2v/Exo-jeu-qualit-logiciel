package cases;

import joueur.Joueur;

public class CaseDepart extends Case {
	
	public CaseDepart() {
		super();
	}

	@Override
	public void action(Joueur j) {
		j.addToCompte(2000);

	}

}
