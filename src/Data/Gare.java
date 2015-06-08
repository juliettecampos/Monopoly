package Data;
public class Gare extends CarreauPropriete {
    private int loyer;
    public Gare(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat) {
        super(numero, nomCarreau, monopoly , _prixAchat);
        this.setLoyerBase(25);
        this.setPrixAchat(_prixAchat);
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

        
	public void calculLoyer() {
		throw new UnsupportedOperationException();
	}

	public int calculLoyerGare() {
		throw new UnsupportedOperationException();
	}

	public void achatPropriete() {
		throw new UnsupportedOperationException();
	}

	public int getPrix() {
	 
               throw new UnsupportedOperationException();         
	}

	public String getNom() {
		return nomCarreau;
	}
}