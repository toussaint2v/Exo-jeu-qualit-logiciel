package cases.propriete;

public class CaseProprieteImmobilier extends CasePropriete{
    private int loyer=200;
    private int prixAchat=1000;

    public CaseProprieteImmobilier() {
        super();
    }

    public String toString() {
        return super.toString()+" Immobiler: prix: "+prixAchat+", loyer: "+loyer;
    }

}
