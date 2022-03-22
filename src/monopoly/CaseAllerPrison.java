package monopoly;

public class CaseAllerPrison extends Case {


	public CaseAllerPrison() {
		super();
	}
	
	
	
	public void action() {
		// TODO Auto-generated method stub
		for(Joueur j:joueurs) {
			j.allerPrison();
		}
	}


}
