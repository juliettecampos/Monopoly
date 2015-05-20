package Data;
public class Compagnie extends CarreauPropriete {
       private int loyer;
    public Compagnie(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat,int _prix, int _loyer) {
        super(numero, nomCarreau, monopoly ,_prixAchat, _prix);
        setLoyer(_loyer);
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }
    
}