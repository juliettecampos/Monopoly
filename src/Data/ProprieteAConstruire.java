package Data;
import java.util.ArrayList;

public class ProprieteAConstruire extends CarreauPropriete {
	private int nbMaisons = 0;
	private int nbHotels = 0;
	private ArrayList<Integer> loyerMaison;

        private int loyer;
        private CouleurPropriete couleur;
        
    public ProprieteAConstruire(Integer numero, String nomCarreau, Monopoly monopoly, Integer _prixAchat, ArrayList<Integer> _loyerMaison, CouleurPropriete _couleur) {
        super(numero, nomCarreau, monopoly, _prixAchat);
       this.setLoyerMaison(_loyerMaison);
    
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
   

    /**
     * @return the groupePropriete
     */
}