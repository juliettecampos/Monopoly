package Data;
public class Gare extends CarreauPropriete {
    private int loyer;
    public Gare(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat) {
        super(numero, nomCarreau, monopoly , _prixAchat);
        this.setLoyerBase(25);
        this.setPrixAchat(_prixAchat);
    }

    public int getLoyer() {
        return loyer;
    }

    public void setLoyer(int loyer) {
        this.loyer = loyer;
    }

        
    @Override
    public int calculLoyer(){
            int nbG;
            nbG=this.getProprietaire().getNombreGare();
            
            loyer=calculLoyerGare(nbG);
            
            this.getMonopoly().communiqueInfo(this.getProprietaire(),loyer,this.getMonopoly().getJoueurCourant());
            
            return loyer;
    }
        
    public int calculLoyerGare(int nbG){
           return nbG*25;
    }

    @Override
    
    public void action(Joueur j){
 //       this.getMonopoly().setJoueurCourant(j);                //erreur quand on tombe sur une gare
        Joueur jProprio = this.getProprietaire();
        if (jProprio == null){
            this.achatPropriete();
        }
        else{
            this.calculLoyer();
        }
    }
    
    
}