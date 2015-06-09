package Jeu;

import Data.*;
import static Data.CouleurPropriete.mauve;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
                

        
	public static void main(String[] args) {
	Monopoly m = new Monopoly("src/Data/data.txt");  
        
        ArrayList<Joueur> joueurs = new ArrayList();     
        
        m.getInterface_3().afficherPlateau(m);
        
        m.initialisePartie();   
            
        m.getInterface_3().attendreClic();
        
        while (m.getJoueurs() != null){
            for (int i = 0; i < m.getJoueurs().size(); i++){
                m.jouerUnCoup(m.getJoueurCourant());
                m.setJoueurCourant(m.joueurSuivant());
                m.getInterface_3().attendreClic();
            }
        }
        
        
        }
}
