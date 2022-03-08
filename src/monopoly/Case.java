package monopoly;

import java.util.ArrayList;

public class Case {
	
	public static int ind=0;
	private int id;
	private ArrayList<Pion> pions;
	
	public Case(){
		id=ind;
		ind++;
		pions=new ArrayList<Pion>();
	}
	
	public void setPion(Pion pion) {
		pions.add(pion);
		pion.setCase(this);
	}
	
	public ArrayList<Pion> getPions() {
		return pions;		
	}
	
	public void removPion(Pion p) {
		pions.remove(p);
	}
	
	public int getCaseId() {
		return id;
	}
	
	public String toString(){
		return "case "+id;
	}

}
