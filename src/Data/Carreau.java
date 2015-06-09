package Data;

public abstract class Carreau {
	private Integer numero;
	String nomCarreau;
	private Monopoly monopoly;

    public Carreau(Integer numero, String nomCarreau, Monopoly monopoly) {
        this.numero = numero;
        this.nomCarreau = nomCarreau;
        this.monopoly = monopoly;
    }

        
        
    public String getNom() {
           return nomCarreau;
    }

    /**
     * @return the numero
     */
        
    
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the nomCarreau
     */
    public String getNomCarreau() {
        return nomCarreau;
    }

    /**
     * @param nomCarreau the nomCarreau to set
     */
    public void setNomCarreau(String nomCarreau) {
        this.nomCarreau = nomCarreau;
    }

    /**
     * @return the monopoly
     */
    public Monopoly getMonopoly() {
        return monopoly;
    }

    /**
     * @param monopoly the monopoly to set
     */
    public void setMonopoly(Monopoly monopoly) {
        this.monopoly = monopoly;
    }
        
    public abstract void action(Joueur j);
        
    
        
}