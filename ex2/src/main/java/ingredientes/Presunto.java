package ingredientes;

import sanduiche.Componente;

public class Presunto extends Decorador {

    public Presunto(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", presunto";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 0.8;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
