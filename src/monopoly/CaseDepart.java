package monopoly;

public class CaseDepart extends Case {
	
	public CaseDepart() {
		super();
	}
	
	public void action() {
		for(Joueur j:joueurs) {
			j.addToCompte(2000);
		}
	}

}
