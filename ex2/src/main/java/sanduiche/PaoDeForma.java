package sanduiche;

import sanduiche.Componente;

public class PaoDeForma extends Componente {

    @Override
    public String getDescricao() {
        return "Pão de forma";
    }

    @Override
    public double getPreco() {
        return 1.00;
    }

    @Override
    public Componente reverter() {
        return this;
    }
}
