package Jeu;

import Data.*;
import static Data.CouleurPropriete.mauve;
import java.util.Scanner;

public class Main {
                

        
	public static void main(String[] args) {
		Monopoly m = new Monopoly("/users/info/pub/1a/M2104/data.txt");  
        Joueur j1 = new Joueur();
        Joueur j2 = new Joueur();
        Joueur j3 = new Joueur();
        Joueur j4 = new Joueur();
        
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
                j1.setNom(str1);
                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                j2.setNom(str2);           
            }
        
            else if( i == 3 ) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Veuillez saisir un nom pour le joueur 1 :");
                String str1= sc.nextLine();
                j1.setNom(str1);
                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                j2.setNom(str2);   
                
                System.out.println("Veuillez saisir un nom pour le joueur 3 :");
                String str3= sc.nextLine();
                j3.setNom(str3);            
            }
            
            else if( i == 4 ) {
                Scanner sc = new Scanner(System.in);

                System.out.println("Veuillez saisir un nom pour le joueur 1 :");
                String str1= sc.nextLine();
                j1.setNom(str1);
                
                System.out.println("Veuillez saisir un nom pour le joueur 2 :");
                String str2= sc.nextLine();
                j2.setNom(str2);   
                
                System.out.println("Veuillez saisir un nom pour le joueur 3 :");
                String str3= sc.nextLine();
                j3.setNom(str3);
                
                System.out.println("Veuillez saisir un nom pour le joueur 4 :");
                String str4= sc.nextLine();
                j4.setNom(str4);    
            }
            
            

          
          
          
          
          
          
          
          
      }
}
