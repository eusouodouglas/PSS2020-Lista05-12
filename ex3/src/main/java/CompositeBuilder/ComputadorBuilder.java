package CompositeBuilder;

public abstract class ComputadorBuilder {

    protected Componente componente;

    public abstract void createComputador();

    public abstract void addPecas();


    public Componente getComputador() {
        return componente;
    }
}
