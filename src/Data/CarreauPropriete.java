package Data;
public abstract class CarreauPropriete extends Carreau {
	private Integer loyerBase;
	private Integer prixAchat;
	private Joueur proprietaire;

    public CarreauPropriete(Integer numero, String nomCarreau, Monopoly monopoly, Integer _prixAchat) {
        super(numero, nomCarreau, monopoly);
        this.loyerBase=0;
        this.setPrixAchat(_prixAchat);        
    }

    public void achatPropriete() {

            int cash = this.getMonopoly().getJoueurCourant().getCash();
            if (cash > this.getPrixAchat()){
                this.getMonopoly().getInterface_3().infoGare(this.getNomCarreau(), this.getPrixAchat());
                
            }
    }

    /**
     * @return the loyerBase
     */
    public int getLoyerBase() {
        return loyerBase;
    }

    /**
     * @param loyerBase the loyerBase to set
     */
    public void setLoyerBase(int loyerBase) {
        this.loyerBase = loyerBase;
    }

    /**
     * @return the prixAchat
     */
    public int getPrixAchat() {
        return prixAchat;
    }

    /**
     * @param prixAchat the prixAchat to set
     */
    public void setPrixAchat(int prixAchat) {
        this.prixAchat = prixAchat;
    }

    public Joueur getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
    
    
    public abstract void calculLoyer();
    
    
  
    
    
    
}

