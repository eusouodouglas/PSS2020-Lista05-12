package ingredientes;

import sanduiche.Componente;

public abstract class Decorador extends Componente {

    Componente elementoDecorado;

    public Decorador(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
