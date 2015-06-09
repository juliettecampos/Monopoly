package Data;
public class Compagnie extends CarreauPropriete {
       private int loyer;
    public Compagnie(int numero, String nomCarreau, Monopoly monopoly, int _prixAchat) {
        super(numero, nomCarreau, monopoly ,_prixAchat);
    }

       @Override
       public int calculLoyer(){
           int nbc;
           int valDes;
           nbc=this.getProprietaire().getNbCompagnies();
           valDes=this.getMonopoly().getValeurDes();
           
           loyer=calcuLoyerCompagnie(nbc,valDes);
           this.getMonopoly().communiqueInfo(this.getProprietaire(),loyer,this.getMonopoly().getJoueurCourant());
           
           return loyer;
    }
  public int calcuLoyerCompagnie(int nbC,int valDes){
          if(nbC==1){
              return 4*valDes;
          }
          if(nbC==2){
              return 10*valDes;
          }
          return 0;
      } 

    @Override
       public Joueur getProprietaire() {
       return super.getProprietaire();
       }   
      
       
       
       
    @Override
    public void action(Joueur j) {
        this.getMonopoly().setJoueurCourant(j);                //erreur quand on tombe sur une gare
        Joueur jProprio = this.getProprietaire();
        if (jProprio == null){
            this.achatPropriete();
        }
        else{
            this.calculLoyer();
        }
    }  
    

}