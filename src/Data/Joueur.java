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
        private int LancerDepart;

    public Joueur(String str, int i) {
        setNom(str);
        LancerDepart=i;
        positionCourante.setNumero(1);
    }

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

        public Carreau getPositionCourante() {
            return positionCourante;
        }

        public ArrayList<Compagnie> getCompagnies() {
            return compagnies;
        }

        public void setCompagnies(ArrayList<Compagnie> compagnies) {
            this.compagnies = compagnies;
        }

        public ArrayList<Gare> getGares() {
            return gares;
        }

        public void setGares(ArrayList<Gare> gares) {
            this.gares = gares;
        }

        public ArrayList<ProprieteAConstruire> getProprietesAConstruire() {
            return proprietesAConstruire;
        }

        public void setProprietesAConstruire(ArrayList<ProprieteAConstruire> proprietesAConstruire) {
            this.proprietesAConstruire = proprietesAConstruire;
        }
        
        
        

	public String getNom() {
		return this.nomJoueur;
	}

	public int getCash() {
		return this.cash;
	}

	public int getNombreGare() {
                return gares.size();
	
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

        public void setNom(String str) {
            nomJoueur=str;
        }
        public int getLancerDepart()    {
            return LancerDepart;
        }
}
