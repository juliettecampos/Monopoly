package Data;
public class Interface {
	private Monopoly monopoly;

	public void afficheTourJoueur(int _val, String _nom, String _carreau) {
		throw new UnsupportedOperationException();
	}

	public void messageEtatJoueur() {
		throw new UnsupportedOperationException();
	}

	public void messageInfo(String _nomp, int _loyer, int _cashRestant) {
		throw new UnsupportedOperationException();
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
}