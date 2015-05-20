package Data;
public abstract class CarreauPropriete extends Carreau {
	private int loyerBase;
	private int prixAchat;
	private String nom;
	
	private int prix;
	private Joueur proprietaire;

    public CarreauPropriete(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat, int _prix) {
        super(numero, nomCarreau, monopoly);
        this.loyerBase=0;
        this.setPrixAchat(_prixAchat);
        this.setPrix(_prix);   
        
    }

	public int getPrix() {
		return this.prix;
	}

	public String getNom() {
		return this.nom;
	}

	public void achatPropriete() {
		throw new UnsupportedOperationException();
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

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the loyer
     */
    /**
     * @param prix the prix to set
     */
    public void setPrix(int prix) {
        this.prix = prix;
    }

    /**
     * @return the proprietaire
     */
    public Joueur getProprietaire() {
        return proprietaire;
    }

    /**
     * @param proprietaire the proprietaire to set
     */
    public void setProprietaire(Joueur proprietaire) {
        this.proprietaire = proprietaire;
    }
}