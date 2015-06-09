package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import static javax.swing.UIManager.get;

public class Monopoly {
	
        private int nbMaisons = 32;
	private int nbHotels = 12;
	private ArrayList<Carreau> carreaux= new ArrayList<Carreau>();;
	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
        private HashMap<Joueur,Integer> players = new HashMap();
	public Interface interface_3;
        private static final Random RANDOM = new Random();
        private Joueur joueurCourant;
        private int valeurDes;
        private HashMap<CouleurPropriete,Groupe> groupes = new HashMap();
        private Joueur premierJoueur;
        
        public Monopoly(String dataFilename){
		buildGamePlateau(dataFilename);
                interface_3 = new Interface(this);
	}

        public ArrayList<Carreau> getCarreaux() {
            return carreaux;
        }

        public void setCarreaux(ArrayList<Carreau> carreaux) {
            this.carreaux = carreaux;
        }

        public ArrayList<Joueur> getJoueurs() {
            return joueurs;
        }

        public void setJoueurs(ArrayList<Joueur> joueurs) {
            this.joueurs = joueurs;
        }

        public int lancerDes() {
            return RANDOM.nextInt(6)+1; 
      	}

	public void achatPropriete() {
		throw new UnsupportedOperationException();
	}
 
	public Joueur getJoueurCourant() {
		return joueurCourant;
	}

	public int calculLoyerGare() {
		throw new UnsupportedOperationException();
	}

	public void communiqueInfo(Joueur _jProprio, int _loyer) {
            
            System.out.println("Propriétaire : "+_jProprio);
            System.out.println("Valeur loyer: "+ _loyer );
           
	}
        
      
	
	private void buildGamePlateau(String dataFilename)
	{
		try{
			ArrayList<String[]> data = readDataFile(dataFilename, ",");
			
			//TODO: create cases instead of displaying
			for(int i=0; i<data.size(); ++i){
                                
				String caseType = data.get(i)[0];
				if(caseType.compareTo("P") == 0){
                                        Groupe g;
					//System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1] + "\t@ " + data.get(i)[3]);
                                        ArrayList<Integer> l = new ArrayList();
                                        for (int j = 5; j <= 10; j++){
                                            l.add(Integer.parseInt(data.get(i)[j]));
                                        }      
                                        if (groupes.containsKey(CouleurPropriete.valueOf(data.get(i)[3]))) {
                                            g = this.getGroupe(CouleurPropriete.valueOf(data.get(i)[3]));           
                                        } else {
                                            g = new Groupe(Integer.parseInt(data.get(i)[11]), Integer.parseInt(data.get(i)[12]), CouleurPropriete.valueOf(data.get(i)[3]));
                                            groupes.put(CouleurPropriete.valueOf(data.get(i)[3]), g);
                                        }
                                        ProprieteAConstruire p = new ProprieteAConstruire(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this, Integer.parseInt(data.get(i)[4]), l, g);
                                        carreaux.add(p);
                                        g.ajouterPropriete(p);
                                }
				else if(caseType.compareTo("G") == 0){
					//System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        Gare g =new Gare(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this, Integer.parseInt(data.get(i)[3]));
                                        carreaux.add(g);
				}
				else if(caseType.compareTo("C") == 0){
					//System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        Compagnie c =new Compagnie(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this, Integer.parseInt(data.get(i)[3]));
                                        carreaux.add(c);
				}
				else if(caseType.compareTo("CT") == 0){
                                        //System.out.println("Case Tirage :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        CarreauTirage ct =new CarreauTirage(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this);
                                        carreaux.add(ct);                                        
				}
				else if(caseType.compareTo("CA") == 0){
					//System.out.println("Case Argent :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        CarreauArgent ca =new CarreauArgent(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this,Integer.parseInt(data.get(i)[3]));
                                        carreaux.add(ca); 
				}
				else if(caseType.compareTo("CM") == 0){
					//System.out.println("Case Mouvement :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        CarreauMouvement cm =new CarreauMouvement(Integer.parseInt(data.get(i)[1]), data.get(i)[2], this);
                                        carreaux.add(cm); 
				}
                                else
					System.err.println("[buildGamePleateau()] : Invalid Data type");
			}
		} 
		catch(FileNotFoundException e){
			System.err.println("[buildGamePlateau()] : File is not found!");
		}
		catch(IOException e){
			System.err.println("[buildGamePlateau()] : Error while reading file!");
		}
                
	}
	
	private ArrayList<String[]> readDataFile(String filename, String token) throws FileNotFoundException, IOException
	{
		ArrayList<String[]> data = new ArrayList<String[]>();
		
		BufferedReader reader  = new BufferedReader(new FileReader(filename));
		String line = null;
		while((line = reader.readLine()) != null){
			data.add(line.split(token));
		}
		reader.close();
		
		return data;
	}
        
       
        
        public void jouerUnCoup(Joueur j) {
            int i = 1;
            if (lancerDesEtAvancer()) {
                while (i <= 2){         //tant que le joueur fait des doubles et qu il en a fait moins de 3 il rejoue.
                    this.getInterface_3().attendreClic();
                    this.getInterface_3().rejouer(j);                  
                    i ++;
                    lancerDesEtAvancer();                    
                }
            }
            if (i == 3) {
                this.getInterface_3().allerEnPrisonDouble(j);
                j.allerEnPrison();        //au bout de 3 double le joueur courant va en prison (case 11).
            }
            System.out.println();
            //j.getPositionCourante().action(j);
            
            
        }
        
         public boolean lancerDesEtAvancer(){                           
            int val1 = 2;//lancerDes();
            int val2 = 3;//lancerDes();            
            
            int val = val1 + val2;
            
            for (Joueur j : joueurs){       //si le joueur est le joueur courant on met a jour sa position
                if (j == joueurCourant){
                    j.setPositionCourante(val);
                }               
            }
            
            interface_3.afficheTourJoueur(val, joueurCourant.getNom(), joueurCourant.getPositionCourante());
            
            interface_3.messageEtatJoueur();
            
            if (val1 == val2){
                return true;
            } else {
                return false;
            }
        }
        public Groupe getGroupe(CouleurPropriete c){
            return groupes.get(c);
        }
        
        public void ajouterJoueur(Joueur j){
            joueurs.add(j);
        }
        
        public void initialisePartie(){
            setJoueurs(interface_3.creerJoueurs(interface_3.nombreJoueurs()));
            int i = 0;
            for (Joueur j : joueurs){
                
                int lancer = lancerDes() + lancerDes();
                
                players.put(j,lancer);
            }
            
            for (Joueur j : players.keySet()){
                if (players.get(j) > i){
                    i = players.get(j);
                }
            }
             
            for (Joueur j : players.keySet()){
                if (players.get(j) == i){
                    premierJoueur = j;
                }      
            }
            
            this.getInterface_3().afficherPremierJoueur(premierJoueur);
            
            this.setJoueurCourant(premierJoueur);
            
            for (Joueur j : joueurs){
                j.setPositionDepart();
            }
        }

        public void setJoueurCourant(Joueur joueurCourant) {
            this.joueurCourant = joueurCourant;
        }

        public Interface getInterface_3() {
            return interface_3;
        }
        
        public Joueur joueurSuivant(){
            if (this.getJoueurs().indexOf(this.getJoueurCourant()) == this.getJoueurs().size()-1){
                return this.getJoueurs().get(0);
            }else {
                return this.getJoueurs().get(this.getJoueurs().indexOf(this.getJoueurCourant()) + 1);
            }
        }
        
        public void failliteJoueur(Joueur j){
            if (j.getCash() <= 0){
                this.getJoueurs().remove(j);
            }
        }
        
        
}

