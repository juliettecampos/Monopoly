
package Data;
public class CarreauMouvement extends CarreauAction {

    public CarreauMouvement(int numero, String nomCarreau, Monopoly monopoly) {
        super(numero, nomCarreau, monopoly);
    }

    @Override
    public void action(Joueur j) {
        throw new UnsupportedOperationException();
    }
}