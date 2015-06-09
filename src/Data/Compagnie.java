package Data;
public class Compagnie extends CarreauPropriete {
       private int loyer;
    public Compagnie(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat) {
        super(numero, nomCarreau, monopoly ,_prixAchat);
    }

    @Override
    public void calculLoyer() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
      public int calculLoyerCompagnie() {
            throw new UnsupportedOperationException();
    }

    
    @Override
    public void action(Joueur j) {
        this.getMonopoly().setJoueurCourant(j);                //erreur quand on tombe sur une gare
        Joueur jProprio = this.getProprietaire();
        if (jProprio == null){
            this.achatPropriete();
        }
        else{
            this.calculLoyerCompagnie();
        }
    }  
    

}