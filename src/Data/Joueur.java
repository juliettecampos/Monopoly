package Data;
import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash = 1500;
	private Monopoly monopoly;
	private ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> gares = new ArrayList<Gare>();
	private Carreau positionCourante;
	private ArrayList<ProprieteAConstruire> proprietesAConstruire = new ArrayList<ProprieteAConstruire>();

	public void setPositionCourante(int _val) {
            int num;
            if ((num = positionCourante.getNumero() + _val) > 40){
                num = (positionCourante.getNumero() + _val) -40;
            } else {
                num = positionCourante.getNumero() + _val;
            }
            
            for (Carreau c : monopoly.getCarreaux()){
                if (c.getNumero() == num) {
                    positionCourante = c;
                }
            }
	}

	public String getNom() {
		return this.nomJoueur;
	}

	public int getCash() {
		return this.cash;
	}

	public void getNombreGare() {
		throw new UnsupportedOperationException();
	}

	public void setCash() {
		throw new UnsupportedOperationException();
	}

	public void ajouterPropriete() {
		throw new UnsupportedOperationException();
	}

	public int calculArgentRestant() {
		throw new UnsupportedOperationException();
	}
}