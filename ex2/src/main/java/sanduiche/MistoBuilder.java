package sanduiche;

import ingredientes.Presunto;
import ingredientes.Queijo;

public class MistoBuilder extends SanduicheBuilder {

    @Override
    public void createSanduiche() {
        componente = new PaoDeForma();
    }

    @Override
    public void addIngredientes() {
        componente = new Queijo(componente);
    }

    @Override
    public void addCarne() {
        componente = new Presunto(componente);
    }

}
