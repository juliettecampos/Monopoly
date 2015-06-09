package Data;
import java.util.ArrayList;

public class Joueur {
	private String nomJoueur;
	private int cash;
	private Monopoly monopoly ;
	private ArrayList<Compagnie> compagnies = new ArrayList<Compagnie>();
	private ArrayList<Gare> gares = new ArrayList<Gare>();
	private Carreau positionCourante;
	private ArrayList<ProprieteAConstruire> proprietesAConstruire = new ArrayList<ProprieteAConstruire>();
        private int LancerDepart;

        public Joueur(String str) {
            setNom(str);
            monopoly = new Monopoly("src/Data/data.txt");
            this.setCash(1500);
        }

        public void setPositionDepart() {
            for (Carreau c : this.getMonopoly().getCarreaux()){
                if (c.getNumero() == 1) {
                    positionCourante = c;
                }
            }
        }

        public String getNomJoueur() {
            return nomJoueur;
        }

        public Monopoly getMonopoly() {
            return monopoly;
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

	public void setCash(int _cash) {
		this.cash = _cash;
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
        
        public void setPosition(int val){
            
            for (Carreau c : this.getMonopoly().getCarreaux()){
                if (c.getNumero() == val){
                    positionCourante = c;
                }
            }
        }    
        
        public void allerEnPrison(){
            this.setPosition(11);
        }
}
