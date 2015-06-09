package Data;
import java.util.ArrayList;

public  class ProprieteAConstruire extends CarreauPropriete {
	private int nbMaisons = 0;
	private int nbHotels = 0;
	private ArrayList<Integer> loyerMaison;

        private int loyer;
        private Groupe groupe;
        
    public ProprieteAConstruire(Integer numero, String nomCarreau, Monopoly monopoly, Integer _prixAchat, ArrayList<Integer> _loyerMaison, Groupe _groupe) {
        super(numero, nomCarreau, monopoly, _prixAchat);
        this.setLoyerMaison(_loyerMaison);
        
    }

	public int getLoyer() {
        return loyer;
	}
    
    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

    public Groupe getGroupe() {
        return groupe;
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

    
    public int calculLoyerPropriete() {
            throw new UnsupportedOperationException();
    }

    
    @Override
    public void action(Joueur j) {
        this.getMonopoly().setJoueurCourant(j);               
        Joueur jProprio = this.getProprietaire();
        if (jProprio == null){
            this.achatPropriete();
        }
        else{
            this.calculLoyerPropriete();
        }
    } 

    @Override
    public void calculLoyer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    
    
}