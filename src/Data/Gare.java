package Data;
public class Gare extends CarreauPropriete {
    private int loyer;
    public Gare(int numero, String nomCarreau, Monopoly monopoly, int _loyerBase, int _prixAchat, int _prix, int _loyer) {
        super(numero, nomCarreau, monopoly , _prixAchat,_prix);
        this.setLoyerBase(_loyerBase);
        this.setPrixAchat(_prixAchat);
        this.setLoyer(_loyer);
        this.setPrix(_prix);
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
		throw new UnsupportedOperationException();
	}
}