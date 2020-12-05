package ingredientes;

import sanduiche.Componente;

public class Tomate extends Decorador {

    public Tomate(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", tomate";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 0.50;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
