package Data;
import java.util.ArrayList;

public class ProprieteAConstruire extends CarreauPropriete {
	private int nbMaisons = 0;
	private int nbHotels = 0;
	private ArrayList<Integer> loyerMaison;
	private int prixMaison;
	private Groupe groupePropriete;
        private int loyer;
    public ProprieteAConstruire(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat, int _prix, Groupe _groupe, ArrayList<Integer> _loyerMaison,int _prixMaison) {
        super(numero, nomCarreau, monopoly, _prixAchat, _prix);
       this.setGroupePropriete(_groupe);
       this.setLoyerMaison(_loyerMaison);
       this.setPrixMaison(_prixMaison);
    }

	public int getLoyer() {
        return loyer;
	}

    // public ProprieteAConstruire(String ligne) {
    //}
    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public Groupe getGroupe() {
        throw new UnsupportedOperationException();
    }

    /**
     * @return the nbMaisons
     */
    public int getNbMaisons() {
        return nbMaisons;
    }

    /**
     * @param nbMaisons the nbMaisons to set
     */
    public void setNbMaisons(int nbMaisons) {
        this.nbMaisons = nbMaisons;
    }

    /**
     * @return the nbHotels
     */
    public int getNbHotels() {
        return nbHotels;
    }

    /**
     * @param nbHotels the nbHotels to set
     */
    public void setNbHotels(int nbHotels) {
        this.nbHotels = nbHotels;
    }

    /**
     * @return the loyerMaison
     */
    public ArrayList<Integer> getLoyerMaison() {
        return loyerMaison;
    }

    /**
     * @param loyerMaison the loyerMaison to set
     */
    public void setLoyerMaison(ArrayList<Integer> loyerMaison) {
        this.loyerMaison = loyerMaison;
    }

    /**
     * @return the prixMaison
     */
    public int getPrixMaison() {
        return prixMaison;
    }

    /**
     * @param prixMaison the prixMaison to set
     */
    public void setPrixMaison(int prixMaison) {
        this.prixMaison = prixMaison;
    }

    /**
     * @return the groupePropriete
     */
    public Groupe getGroupePropriete() {
        return groupePropriete;
    }

    /**
     * @param groupePropriete the groupePropriete to set
     */
    public void setGroupePropriete(Groupe groupePropriete) {
        this.groupePropriete = groupePropriete;
    }
}