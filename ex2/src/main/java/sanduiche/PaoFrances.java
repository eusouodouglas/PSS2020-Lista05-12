package sanduiche;

import sanduiche.Componente;

public class PaoFrances extends Componente {

    @Override
    public String getDescricao() {
        return "Pão frances";
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
