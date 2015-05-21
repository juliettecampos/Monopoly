package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import static javax.swing.UIManager.get;

public class Monopoly {
	
        private int nbMaisons = 32;
	private int nbHotels = 12;
	private Carreau carreaux;
	private ArrayList<Joueur> joueurs = new ArrayList<Joueur>();
	public Interface interface_3;

	public int lancerDes() {
		throw new UnsupportedOperationException();
	}

	public void achatPropriete() {
		throw new UnsupportedOperationException();
	}

	public Joueur getJoueurCourant() {
		throw new UnsupportedOperationException();
	}

	public int calculLoyerGare() {
		throw new UnsupportedOperationException();
	}

	public void communiqueInfo(Joueur _jProprio, int _loyer) {
		throw new UnsupportedOperationException();
	}
        
        public Monopoly(String dataFilename){
		buildGamePlateau(dataFilename);
	}
	
	private void buildGamePlateau(String dataFilename)
	{
		try{
			ArrayList<String[]> data = readDataFile(dataFilename, ",");
			
			//TODO: create cases instead of displaying
			for(int i=0; i<data.size(); ++i){
				String caseType = data.get(i)[0];
				if(caseType.compareTo("P") == 0){
					//System.out.println("Propriété :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1] +data.get(i)[3])+data.get(i)[3];
                                        ArrayList<Integer> l = new ArrayList();
                                        for (int j = 5; j <= 10; j++){
                                            l.add(Integer.parseInt(data.get(i)[j]));
                                        }
                                        ProprieteAConstruire p=new ProprieteAConstruire(i, data.get(i)[2], this, Integer.parseInt(data.get(i)[4]), l, CouleurPropriete.valueOf(data.get(i)[3]));
                                }
				else if(caseType.compareTo("G") == 0){
					//System.out.println("Gare :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        Gare g =new Gare(i, data.get(i)[2], this, Integer.parseInt(data.get(i)[3]));
				}
				else if(caseType.compareTo("C") == 0){
					//System.out.println("Compagnie :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
                                        Compagnie c =new Compagnie(i, data.get(i)[2], this, Integer.parseInt(data.get(i)[3]));
				}
				else if(caseType.compareTo("CT") == 0){
					System.out.println("Case Tirage :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("CA") == 0){
					System.out.println("Case Argent :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
				}
				else if(caseType.compareTo("CM") == 0){
					System.out.println("Case Mouvement :\t" + data.get(i)[2] + "\t@ case " + data.get(i)[1]);
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
}

