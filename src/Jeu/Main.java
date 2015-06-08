package Jeu;

import Data.*;
import static Data.CouleurPropriete.mauve;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
                

        
	public static void main(String[] args) {
	Monopoly m = new Monopoly("src/Data/data.txt");  
        
        ArrayList<Joueur> joueurs = new ArrayList();
        
        System.out.println("Combien de joueurs ?");
        Scanner nbj = new Scanner(System.in);
        int i=nbj.nextInt();
        
            
        if( i == 1 ) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Impossible, prends un curly.");    
        }

        else if( i == 2 ) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Veuillez saisir un nom pour le joueur 1 :");
            String str1= sc.nextLine();
            Joueur j1 = new Joueur(str1, m.lancerDes()+m.lancerDes());
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j1.getLancerDepart());

            
            System.out.println("Veuillez saisir un nom pour le joueur 2 :");
            String str2= sc.nextLine();
            Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes());
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j2.getLancerDepart());
            
            System.out.println(j1.getPositionCourante());
            System.out.println(j2.getPositionCourante());

        }

        else if( i == 3 ) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Veuillez saisir un nom pour le joueur 1 :");
            String str1= sc.nextLine();
            Joueur j1 = new Joueur(str1, m.lancerDes()+m.lancerDes()); 
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j1.getLancerDepart());
            
            System.out.println("Veuillez saisir un nom pour le joueur 2 :");
            String str2= sc.nextLine();
            Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes()); 
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j2.getLancerDepart());

            System.out.println("Veuillez saisir un nom pour le joueur 3 :");
            String str3= sc.nextLine();
            Joueur j3 = new Joueur(str3, m.lancerDes()+m.lancerDes()); 
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j3.getLancerDepart());
        }

        else if( i == 4 ) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Veuillez saisir un nom pour le joueur 1 :");
            String str1= sc.nextLine();
            Joueur j1 = new Joueur(str1, m.lancerDes()+m.lancerDes());  
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j1.getLancerDepart());

            System.out.println("Veuillez saisir un nom pour le joueur 2 :");
            String str2= sc.nextLine();
            Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes());    
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j2.getLancerDepart());

            System.out.println("Veuillez saisir un nom pour le joueur 3 :");
            String str3= sc.nextLine();
            Joueur j3 = new Joueur(str3, m.lancerDes()+m.lancerDes());     
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j3.getLancerDepart());

            System.out.println("Veuillez saisir un nom pour le joueur 4 :");
            String str4= sc.nextLine();
            Joueur j4 = new Joueur(str4, m.lancerDes()+m.lancerDes()); 
            System.out.print("Resultat du lancé de dé : ");
            System.out.println(j4.getLancerDepart());
        }
        

                
        for (Carreau c : m.getCarreaux()){
            System.out.println(c.getNom());
        }
       
       
          
          
          
          
          
          
          
      }
}
