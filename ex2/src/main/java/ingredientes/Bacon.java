package ingredientes;

import sanduiche.Componente;

public class Bacon extends Componente {

    Componente elementoDecorado;

    public Bacon(Componente elementoDecorado) {
        this.elementoDecorado = elementoDecorado;
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", bacon";
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
