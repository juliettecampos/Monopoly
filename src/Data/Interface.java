package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Interface {
	private Monopoly monopoly;
        
        public Interface (Monopoly m){
            monopoly = m;
        }

	public void afficheTourJoueur(int _val, String _nom, Carreau _carreau) {
            System.out.println(_nom + " joue un coup.");
            System.out.println("Valeur des dès : "+ _val );
            System.out.println(_nom + " arrive sur le carreau " + _carreau.getNumero() + " " + _carreau.getNom());
            System.out.println();
	}

        public int nombreJoueurs(){
            System.out.println("Combien de joueurs ?");
            Scanner nbj = new Scanner(System.in);
            int i=nbj.nextInt();
            return i;
        }
        
        public ArrayList<Joueur> creerJoueurs(int nb){
            ArrayList<Joueur> joueurs = new ArrayList();
            for (int i = 0; i < nb; i ++)   {
                System.out.println("Nom du joueur "+(i+1));
                Scanner sc = new Scanner(System.in);
                String nom = sc.nextLine();
                Joueur joueur = new Joueur(nom);
                joueurs.add(joueur);
                System.out.println();
            }
            return joueurs;
        }
        
	public void messageEtatJoueur() {
		for (Joueur j : monopoly.getJoueurs()){
                    System.out.println(j.getNom());
                    System.out.println("Position : " + j.getPositionCourante().getNomCarreau());
                    System.out.println("Cash : " + j.getCash() + "$");
                    System.out.print("Compagnies : ");
                    if (j.getCompagnies().size() == 0){
                        System.out.println("Auncune compagnies.");
                    }else{
                    for (Compagnie c : j.getCompagnies()){
                        System.out.println("   "+c.getNom());
                    }
                    }
                    System.out.print("Gares : ");
                    if (j.getNombreGare() == 0){
                        System.out.println("Auncune gare.");
                    }else{
                    for (Gare g : j.getGares()){
                        System.out.println("   "+g.getNom());
                    }
                    }
                    System.out.print("Proprietes : ");
                    if (j.getProprietesAConstruire().size() == 0){
                        System.out.println("Auncune propriete.");
                    }else{
                        for (ProprieteAConstruire p : j.getProprietesAConstruire()){
                        System.out.println("   "+p.getNom() + p.getGroupe().toString());
                        }
                    }
                    System.out.println();
                }
	}

	public void messageInfo(String _nomp, int _loyer, int _cashRestant) {
		System.out.println("Propriétaire : " + _nomp);
                System.out.println("Loyer : " + _loyer);
                System.out.println("Argent restant : " + _cashRestant);
                System.out.println();
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
    
    public void afficherJoueur(Monopoly m){
        for (Joueur j : m.getJoueurs()){
            System.out.println(j.getNom());
        }
        System.out.println();
    }
    
    public void afficherPlateau(Monopoly m){
        for (Carreau c : m.getCarreaux()){
            System.out.println("Carreau " + c.getNumero() + " : " + c.getNomCarreau());
        }
        System.out.println();
    }
    
    public void afficherPremierJoueur(Joueur j){
        System.out.println(j.getNom() + " commence à jouer.");
        System.out.println();
    }
    
    public void rejouer(Joueur j){
        System.out.println(j.getNom() + " a fait un double et rejoue.");
        System.out.println();
    }
    
    public void allerEnPrisonDouble(Joueur j){
        System.out.println(j.getNom() + " a fait 3 doubles et va en prison.");
        System.out.println();
    }
    
    public void attendreClic(){
        System.out.println("Appuyez sur ENTREE");
        Scanner sc = new Scanner(System.in);
        String entree = sc.nextLine();
    }
    
}