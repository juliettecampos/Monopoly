package Data;
import java.util.ArrayList;

public class Groupe {
	private int prixAchatMaison;
	private int prixAchatHotel;
	private CouleurPropriete couleur;
	private ArrayList<ProprieteAConstruire> proprietes = new ArrayList<ProprieteAConstruire>();

    public Groupe(int prixAchatMaison, int prixAchatHotel, CouleurPropriete couleur, ArrayList<ProprieteAConstruire> _proprietes) {
        this.prixAchatMaison = prixAchatMaison;
        this.prixAchatHotel = prixAchatHotel;
        this.couleur = couleur;
        this.setProprietes(_proprietes);
    }
        
        
        
        

    public int getPrixAchatMaison() {
        return prixAchatMaison;
    }

    public int getPrixAchatHotel() {
        return prixAchatHotel;
    }

    public CouleurPropriete getCouleur() {
        return couleur;
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
        
        
}