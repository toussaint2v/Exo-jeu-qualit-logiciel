package cases.Propriete;

public class CaseProprieteGare extends CasePropriete{
    private int loyer=300;
    private int prixAchat=1300;

    public CaseProprieteGare() {
        super();
    }

    public String toString() {
        return super.toString()+" Gare: prix: "+prixAchat+", loyer: "+loyer;
    }

}
