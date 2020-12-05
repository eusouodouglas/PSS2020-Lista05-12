package sanduiche;

import ingredientes.Tomate;
import ingredientes.Alface;
import ingredientes.BifeBovino;

public class SanduicheBasicoBuilder extends SanduicheBuilder {

    @Override
    public void createSanduiche() {
        componente = new PaoFrances();
    }

    @Override
    public void addIngredientes() {
        componente = new Alface(componente);
        componente = new Tomate(componente);
    }

    @Override
    public void addCarne() {
        componente = new BifeBovino(componente);
    }

}
