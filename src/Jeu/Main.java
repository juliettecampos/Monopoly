package Jeu;

import Data.*;
import static Data.CouleurPropriete.mauve;
import java.util.Scanner;

public class Main {
                

        
	public static void main(String[] args) {
	Monopoly m = new Monopoly("src/Data/data.txt");  
        /*
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        Joueur j3 = new Joueur();
        Joueur j4 = new Joueur();
        */
        
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
                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes());            }
        
            else if( i == 3 ) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Veuillez saisir un nom pour le joueur 1 :");
                String str1= sc.nextLine();
                Joueur j1 = new Joueur(str1, m.lancerDes()+m.lancerDes());                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes()); 
                
                System.out.println("Veuillez saisir un nom pour le joueur 3 :");
                String str3= sc.nextLine();
                Joueur j3 = new Joueur(str3, m.lancerDes()+m.lancerDes());          
            }
            
            else if( i == 4 ) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Veuillez saisir un nom pour le joueur 1 :");
                String str1= sc.nextLine();
                Joueur j1 = new Joueur(str1, m.lancerDes()+m.lancerDes());                
                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                Joueur j2 = new Joueur(str2, m.lancerDes()+m.lancerDes());                
                
                System.out.println("Veuillez saisir un nom pour le joueur 3 :");
                String str3= sc.nextLine();
                Joueur j3 = new Joueur(str3, m.lancerDes()+m.lancerDes());                
                
                System.out.println("Veuillez saisir un nom pour le joueur 4 :");
                String str4= sc.nextLine();
                Joueur j4 = new Joueur(str4, m.lancerDes()+m.lancerDes());                
            }
            
            
          
          
          
          
          
          
          
          
      }
}
