package ingredientes;

import sanduiche.Componente;

public class Alface extends Decorador {

    public Alface(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", alface";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 0.5;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
