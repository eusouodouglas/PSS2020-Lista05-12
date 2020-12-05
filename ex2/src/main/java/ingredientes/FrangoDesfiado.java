package ingredientes;

import sanduiche.Componente;

public class FrangoDesfiado extends Decorador {

    public FrangoDesfiado(Componente elementoDecorado) {
        super(elementoDecorado);
    }

    @Override
    public String getDescricao() {
        return this.elementoDecorado.getDescricao() + ", frango desfiado";
    }

    @Override
    public double getPreco() {
        return this.elementoDecorado.getPreco() + 1.1;
    }

    @Override
    public Componente reverter() {
        return (Componente) elementoDecorado;
    }
}
