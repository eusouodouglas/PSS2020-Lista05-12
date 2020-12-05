package ingredientes;

import sanduiche.Componente;

public class Ovo extends Decorador {

    public Ovo(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", ovo";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 0.90;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
