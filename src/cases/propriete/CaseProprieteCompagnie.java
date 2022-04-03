package cases.propriete;

public class CaseProprieteCompagnie extends CasePropriete{
    private int loyer=500;
    private int prixAchat=1500;

    public CaseProprieteCompagnie() {
        super();
    }

    public String toString() {
        return super.toString()+" Compagnie: prix: "+prixAchat+", loyer: "+loyer;
    }


}
