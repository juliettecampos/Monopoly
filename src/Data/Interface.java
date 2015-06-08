package Data;
public class Interface {
	private Monopoly monopoly;

	public void afficheTourJoueur(int _val, String _nom, String _carreau) {
            System.out.println("Nom joueur : "+_nom);
            System.out.println("Valeur des dès : "+ _val );
            System.out.println("Nom carreau : "+ _carreau);
	}

	public void messageEtatJoueur() {
		for (Joueur j : monopoly.getJoueurs()){
                    int i = 0;
                    System.out.println("Joueur"+ i +"  :");
                    System.out.println("Nom : "+j.getNom());
                    System.out.println("Position : " + j.getPositionCourante());
                    System.out.println("Cash : " + j.getCash() + "$");
                    System.out.println("Compagnie : ");
                    for (Compagnie c : j.getCompagnies()){
                        System.out.println("   "+c.getNom());
                    }
                    for (Gare g : j.getGares()){
                        System.out.println("   "+g.getNom());
                    }
                    for (ProprieteAConstruire p : j.getProprietesAConstruire()){
                        System.out.println("   "+p.getNom() + p.getGroupe().toString());
                    }
                    
                }
	}

	public void messageInfo(String _nomp, int _loyer, int _cashRestant) {
		System.out.println("Propriétaire : " + _nomp);
                System.out.println("Loyer : " + _loyer);
                System.out.println("Argent restant : " + _cashRestant);
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
}