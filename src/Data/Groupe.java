package Data;
import java.util.ArrayList;

public class Groupe {
	private int prixAchatMaison;
	private int prixAchatHotel;
	private CouleurPropriete couleur;
	private ArrayList<ProprieteAConstruire> proprietes = new ArrayList<ProprieteAConstruire>();

    public Groupe(int prixAchatMaison, int prixAchatHotel, CouleurPropriete couleur) {
        this.prixAchatMaison = prixAchatMaison;
        this.prixAchatHotel = prixAchatHotel;
        this.couleur = couleur;
    }
        
        
        
    public CouleurPropriete getCouleur(){
       return couleur;
    }    

    public int getPrixAchatMaison() {
        return prixAchatMaison;
    }

    public int getPrixAchatHotel() {
        return prixAchatHotel;
    }


    public ArrayList<ProprieteAConstruire> getProprietes() {
        return proprietes;
    }

    public void setPrixAchatMaison(int prixAchatMaison) {
        this.prixAchatMaison = prixAchatMaison;
    }

    public void setPrixAchatHotel(int prixAchatHotel) {
        this.prixAchatHotel = prixAchatHotel;
    }

    public void setCouleur(CouleurPropriete couleur) {
        this.couleur = couleur;
    }

    public void setProprietes(ArrayList<ProprieteAConstruire> proprietes) {
        this.proprietes = proprietes;
    }
        
    public void ajouterPropriete(ProprieteAConstruire p){
        proprietes.add(p);
    }
        
}