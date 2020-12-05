package sanduiche;

public abstract class Componente {

    protected String descricao;
    protected double preco;

    public Componente() {
    }

    public abstract String getDescricao();

    public abstract double getPreco();

    public abstract Componente reverter();

    @Override
    public String toString() {
        return getDescricao() + "\n" + getPreco();
    }

}
