package ingredientes;

import sanduiche.Componente;

public class Queijo extends Decorador {

    public Queijo(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", queijo";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 1;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
