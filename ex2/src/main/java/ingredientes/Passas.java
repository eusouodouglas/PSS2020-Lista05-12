package ingredientes;

import sanduiche.Componente;

public class Passas extends Decorador {

    public Passas(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", passas";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 0.1;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
