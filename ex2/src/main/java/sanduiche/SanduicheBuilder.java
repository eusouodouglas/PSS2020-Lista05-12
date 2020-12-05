package sanduiche;

public abstract class SanduicheBuilder {

    protected Componente componente;

    public abstract void createSanduiche();

    public abstract void addIngredientes();

    public abstract void addCarne();

    public Componente getSanduiche() {
        return componente;
    }
}
