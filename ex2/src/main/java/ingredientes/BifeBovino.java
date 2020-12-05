package ingredientes;

import sanduiche.Componente;

public class BifeBovino extends Decorador {

    public BifeBovino(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", bife bovino";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 2.50;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
